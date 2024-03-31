package com.example.gen20javaspringbootpos.repository;

import com.example.gen20javaspringbootpos.entity.Category;
import com.example.gen20javaspringbootpos.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    public List<Category> findByName(String name);

}
