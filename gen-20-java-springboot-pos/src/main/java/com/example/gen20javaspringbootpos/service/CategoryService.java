package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.entity.Category;
import com.example.gen20javaspringbootpos.entity.Product;
import com.example.gen20javaspringbootpos.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepo;

    public CategoryService() {
    }

    public Optional<Category> findById(int id){

        return categoryRepo.findById(id);
    }

    //@Override
    public List<Category> fetchCatList() {
        return categoryRepo.findAll();
    }


    public void insertCategory(Category c) {
        categoryRepo.save(c);
    }



    public List<Category> findByName(String name){
        return categoryRepo.findByName(name);

    }
}
