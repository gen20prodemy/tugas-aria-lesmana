package com.example.gen20javaspringbootframework.repository;

import com.example.gen20javaspringbootframework.entity.Category;
import com.example.gen20javaspringbootframework.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    public List<Category> findByName(String name);

}
