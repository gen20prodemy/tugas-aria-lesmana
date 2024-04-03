package com.example.gen20javaspringbootpos.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "Product")
@Table(name = "product", schema = "pos")
public class Product {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private int price;
    @Column(name = "category_id", nullable = false)
    private int categoryId;
    @Column(name = "quantity")
    private int quantity;

    public Product(){}

    public Product(int id, String name, int price, int categoryId, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
        this.quantity = quantity;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", categoryId=" + categoryId +
                ", quantity=" + quantity +
                '}';
    }
}


