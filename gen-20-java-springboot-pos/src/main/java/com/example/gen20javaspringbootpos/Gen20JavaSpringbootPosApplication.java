package com.example.gen20javaspringbootpos;

import com.example.gen20javaspringbootpos.controller.CategoryController;
import com.example.gen20javaspringbootpos.controller.ProductController;
import com.example.gen20javaspringbootpos.controller.TransactionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.example.gen20javaspringbootpos"})
@ComponentScan(basePackageClasses = {ProductController.class, CategoryController.class, TransactionController.class})
public class Gen20JavaSpringbootPosApplication{

	public static void main(String[] args) {
		SpringApplication.run(Gen20JavaSpringbootPosApplication.class, args);
	}

}
