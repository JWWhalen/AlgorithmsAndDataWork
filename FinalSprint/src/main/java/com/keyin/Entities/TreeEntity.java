package com.keyin.Entities;

import javax.persistence.*;

@Entity
public class TreeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numbers;

    @Lob
    private String treeJson;

    //constructours, getters, setters
    public TreeEntity() {}

    public TreeEntity(String numbers, String treeJson) {
        this.numbers = numbers;
        this.treeJson = treeJson;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getTreeJson() {
        return treeJson;
    }

    public void setTreeJson(String treeJson) {
        this.treeJson = treeJson;
    }
}
