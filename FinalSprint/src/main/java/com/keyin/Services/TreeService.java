package com.keyin.Services;

import com.keyin.Entities.TreeEntity;
import com.keyin.Repositories.TreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeService {

    @Autowired
    private TreeRepository treeRepository;

    public void saveTree(List<Integer> numbers, String treeJson) {
        TreeEntity tree = new TreeEntity(numbers.toString(), treeJson);
        treeRepository.save(tree);
    }

    public List<TreeEntity> getAllTrees() {
        return treeRepository.findAll();
    }
}
