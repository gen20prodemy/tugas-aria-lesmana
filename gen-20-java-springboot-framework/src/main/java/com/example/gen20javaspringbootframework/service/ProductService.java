package com.example.gen20javaspringbootframework.service;


import com.example.gen20javaspringbootframework.entity.Product;
import com.example.gen20javaspringbootframework.repository.CategoryRepository;
import com.example.gen20javaspringbootframework.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.gen20javaspringbootframework.entity.Category;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> listProduct;

    @Autowired
    private ProductRepository productRepo;
    @Autowired
    private CategoryRepository catRepo;


    public ProductService(){
        listProduct = new ArrayList<>();
        Product p1=new Product(1, "Chiki", 5000,1,50);
        Product p2=new Product(2, "Kopi", 5000,2,70);
        Product p3=new Product(3, "Panadol", 7000,3,100);
        Product p4=new Product(4, "Teh", 3000,2,100);
        Product p5=new Product(5, "Susu", 7000,2,30);
        Product p6=new Product(6, "Roti", 10000,1,50);
        listProduct.addAll(Arrays.asList(p1,p2,p3,p4,p5,p6));
    }

    public List<Product> getProductDefault(){
        return listProduct;
    }

    //@Override
    public Optional<Product> findById(int id){

        return productRepo.findById(id);
    }

    //@Override
    public List<Product> fetchProdList() {
        return productRepo.findAll();
    }

    public List<Product> findByCategoryId(int categoryId) {
        return productRepo.findByCategoryId(categoryId);
    }

    public void insertProduct(Product p) {
        productRepo.save(p);
    }

    public void deleteProduct(int id){ productRepo.deleteById(id);}

    public List<Category> findByCategoryName(String categoryName) {
        return catRepo.findByName(categoryName);
    }


}
