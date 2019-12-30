package com.bincy.product.dto;
// This class is used to transfer data between ui and services
public class Product {

    private int id; // to store product id
    private String name; // to store product name
    private String  description; // to give description of product
    private int price;// to store the price of product

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
