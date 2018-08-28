package com.example.groupbuy.groupbuy;

import android.widget.ImageView;

import java.util.Date;

public class Product {
    public Product(int id, String name, ImageView picture, String description, int price, Date publishDate, int category, int subcategory) {
        this.id = id;
        this.name = name;
        this.picture = picture;
        this.description = description;
        this.price = price;
        this.publishDate = publishDate;
        this.category = category;
        this.subcategory = subcategory;
    }

    private int id;
    private String name;
    private ImageView picture;
    private String description;
    private int price;
    private Date publishDate;
    private int category;
    private int subcategory;

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(int subcategory) {
        this.subcategory = subcategory;
    }



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

    public ImageView getPicture() {
        return picture;
    }

    public void setPicture(ImageView picture) {
        this.picture = picture;
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

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }


}

