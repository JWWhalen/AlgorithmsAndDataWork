package com.keyin.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keyin.Entities.TreeEntity;
import com.keyin.Services.TreeService;
import com.keyin.Models.BinarySearchTree;
import com.keyin.Models.NumbersInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TreeController {

    @Autowired
    private TreeService treeService;

    @GetMapping("/enter-numbers")
    public String enterNumbers(Model model) {
        model.addAttribute("numbers", new NumbersInput());
        return "enter-numbers";
    }

    @PostMapping("/process-numbers")
    public String processNumbers(@ModelAttribute NumbersInput numbersInput, Model model) {
        try {
            BinarySearchTree bst = new BinarySearchTree();
            for (int num : numbersInput.getNumbers()) {
                bst.insert(num);
            }

            //convert the tree to JSON
            ObjectMapper mapper = new ObjectMapper();
            String treeJson = mapper.writeValueAsString(bst.getRoot());

            System.out.println("Generated Tree JSON: " + treeJson); // Debugging output

            //save the tree to the database
            treeService.saveTree(numbersInput.getNumbers(), treeJson);

            //a dthe JSON string to the model
            model.addAttribute("treeJson", treeJson);
            return "tree-result";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("errorMessage", "An error occurred while processing your request.");
            return "error-page";
        }
    }



    @GetMapping("/previous-trees")
    public String previousTrees(Model model) {
        List<TreeEntity> trees = treeService.getAllTrees();
        model.addAttribute("trees", trees);
        return "previous-trees";
    }
}
