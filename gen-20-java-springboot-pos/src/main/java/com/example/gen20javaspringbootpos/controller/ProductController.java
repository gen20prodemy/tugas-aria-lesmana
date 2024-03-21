package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.model.Product;
import com.example.gen20javaspringbootpos.model.ResponseInsert;
import com.example.gen20javaspringbootpos.service.ProductImplementation;
import com.example.gen20javaspringbootpos.service.ProductRepository;
import com.example.gen20javaspringbootpos.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@ComponentScan({"com.gen-20-java-springboot-pos."})
@RequestMapping(path="api")
@RestController
public class ProductController{

    @Autowired
    @Qualifier("productService")
    private ProductService productService;
    @Autowired
    private ProductRepository productRepo;

    @PostMapping("/productid")
    public Optional<Product> findById(int id){
        return productService.findById(id);
    }

    //method API Select
    @PostMapping("/allproduct")
    public List<Product> fetchProdList() {
        return productService.fetchProdList();
        }

    //@GetMapping("/test")
    //public String test() { return "test ok"; }


    @PostMapping("/findcat")
    public List<Product> findCat(int catId) { return productService.findByCategoryId(catId); }

    //method API insert
    @PostMapping("/insert")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ResponseInsert insertProduct(@RequestBody Product pr) {
        productService.insertProduct(pr);
        return new ResponseInsert(HttpStatus.OK.value(),"Berhasil Insert");
    }

}
