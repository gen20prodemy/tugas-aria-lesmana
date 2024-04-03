package com.example.gen20javaspringbootpos.model;

import com.example.gen20javaspringbootpos.entity.Category;
import com.example.gen20javaspringbootpos.entity.Product;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
public class ProductDto {
        private final String name;
        private final int price;
        private final int quantity;
        private final int categoryId;

        public ProductDto(String name, int price, int quantity, int categoryId ) {
            this.name = name;
            this.categoryId = categoryId;
            this.price = price;
            this.quantity=quantity;
        }
    public Product dtoToEntity(){
        Product product = new Product();

        product.setName(name);
        product.setPrice(price);
        product.setCategoryId(categoryId);
        product.setQuantity(quantity);
        return product;
    }
}
