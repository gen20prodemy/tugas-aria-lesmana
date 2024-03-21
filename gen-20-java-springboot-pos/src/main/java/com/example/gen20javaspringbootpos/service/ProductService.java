package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {//implements ProductImplementation{
    private List<Product> listProduct;

    @Autowired
    private ProductRepository productRepo;

    public ProductService(){
        /*listProduct = new ArrayList<>();
        Product p1=new Product(1, "AAA", 10000,1,30);
        Product p2=new Product(2, "BBB", 10000,1,30);

        listProduct.addAll(Arrays.asList(p1,p2));*/
    }

    //public List<Product> getProduct(){
    //    return listProduct;
    //}

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
}
