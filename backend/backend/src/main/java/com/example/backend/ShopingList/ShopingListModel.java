package com.example.backend.ShopingList;

import jakarta.persistence.*;

@Entity
@Table(name = "shopinglisttable")
public class ShopingListModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public ShopingListModel() {
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

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public ShopingListModel(Integer id, String name, float quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    private String name;


    private float quantity;

}
