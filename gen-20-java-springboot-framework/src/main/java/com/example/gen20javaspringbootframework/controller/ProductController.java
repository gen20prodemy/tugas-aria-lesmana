package com.example.gen20javaspringbootframework.controller;

import com.example.gen20javaspringbootframework.entity.Product;
import com.example.gen20javaspringbootframework.model.ResponseFormat;
import com.example.gen20javaspringbootframework.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@ComponentScan({"com.gen-20-java-springboot-pos."})
@RequestMapping(path="api/production")
@Controller
public class ProductController{

    @Autowired
    @Qualifier("productService")
    private ProductService productService;
/*
    @PostMapping("/byid/{id}")
    public Optional<Product> findById(@PathVariable("id") int id){
        return productService.findById(id);
    }

    //method API Select
    @PostMapping("/showall")
    public List<Product> fetchProdList() {
        return productService.fetchProdList();
        }

    //@GetMapping("/test")
    //public String test() { return "test ok"; }


    @PostMapping("/bycategory")
    public List<Product> findCat(int catId) { return productService.findByCategoryId(catId); }

    @PostMapping("/bycatname")
    public List<Product> findCatName(String name) {
        int id = productService.findByCategoryName(name).get(0).getId();
        return findCat(id);
    }

    //method API insert
    @PostMapping("/insert")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseFormat insertProduct(@RequestBody Product pr) {
        productService.insertProduct(pr);
        return new ResponseFormat(HttpStatus.CREATED.value(),"Berhasil Insert");
    }

    @PostMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    public ResponseFormat deleteProduct(int id){
        productService.deleteProduct(id);
        return new ResponseFormat(HttpStatus.OK.value(),"Berhasil Delete");
    }*/

    @GetMapping("/index")
    public String productTable(Model model){
        model.addAttribute("products",productService.fetchProdList());
        return "index";
    }

    @GetMapping("/indexdefault")
    public String productTableDefault(Model model){
        model.addAttribute("products",productService.getProductDefault());
        return "index";
    }

}
