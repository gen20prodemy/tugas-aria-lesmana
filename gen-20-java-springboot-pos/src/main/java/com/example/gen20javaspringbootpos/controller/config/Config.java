package com.example.gen20javaspringbootpos.controller.config;

import com.example.gen20javaspringbootpos.service.CategoryService;
import com.example.gen20javaspringbootpos.service.CustomerService;
import com.example.gen20javaspringbootpos.service.ProductService;
import com.example.gen20javaspringbootpos.service.TransactionService;
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
    @Bean
    public TransactionService transactionService() {
        return new TransactionService();
    }
    @Bean
    public CustomerService customerService(){ return new CustomerService();}
}
