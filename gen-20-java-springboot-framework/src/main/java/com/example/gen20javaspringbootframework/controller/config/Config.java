package com.example.gen20javaspringbootframework.controller.config;

import com.example.gen20javaspringbootframework.service.CategoryService;
import com.example.gen20javaspringbootframework.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public ProductService productService() {
        return new ProductService();
    }
    @Bean
    public CategoryService categoryService() {
        return new CategoryService();
    }

}
