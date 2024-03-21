package com.example.gen20javaspringbootpos.service;


import com.example.gen20javaspringbootpos.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductImplementation {


    //Product findById(Integer id);

    //@Query("select * from Product")
    List<Product> fetchProdList();

    //@Query("select * from Product where id = prodId")
    Optional<Product> findById(/*@Param("prodId")*/ int id);


}

