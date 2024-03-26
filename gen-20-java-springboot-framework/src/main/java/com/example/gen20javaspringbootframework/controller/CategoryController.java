package com.example.gen20javaspringbootframework.controller;

import com.example.gen20javaspringbootframework.entity.Category;
import com.example.gen20javaspringbootframework.model.ResponseFormat;
import com.example.gen20javaspringbootframework.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@ComponentScan({"com.gen-20-java-springboot-pos."})
@RequestMapping(path="api/category")
@RestController
public class CategoryController{

    @Autowired
    @Qualifier("categoryService")
    private CategoryService categoryService;

    @PostMapping("/byid")
    public Optional<Category> findById(int id){
        return categoryService.findById(id);
    }

    @PostMapping("/byname")
    public List<Category> findCatName(String name) {
        return categoryService.findByName(name);
    }
    //method API Select
    @PostMapping("/showall")
    public List<Category> fetchCatList() {
        return categoryService.fetchCatList();
    }

    //method API insert
    @PostMapping("/insert")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseFormat insertCategory(@RequestBody Category cat) {
        categoryService.insertCategory(cat);
        return new ResponseFormat(HttpStatus.CREATED.value(),"Berhasil Insert");
    }

}
