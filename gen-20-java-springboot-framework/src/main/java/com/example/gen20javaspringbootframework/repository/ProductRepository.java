package com.example.gen20javaspringbootframework.repository;

import com.example.gen20javaspringbootframework.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    public List<Product> findByCategoryId(int categoryId);


}
