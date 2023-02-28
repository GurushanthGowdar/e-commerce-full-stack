package com.example.backend.Recipe;

import jakarta.persistence.*;

@Entity(name = "recipe_model")
@Table(name = "recipe_model")
public class RecipeModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String name;

    public RecipeModel(Integer id, String name, String desc, String imageurl) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.imageurl = imageurl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public RecipeModel() {
    }

    @Column(name = "description")
    private String desc;

    private String imageurl;

}
