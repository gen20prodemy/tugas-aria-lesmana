package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

        @Bean
        public ProductService productService() {
            return new ProductService();
        }

}
