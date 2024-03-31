package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.entity.Category;
import com.example.gen20javaspringbootpos.entity.Customer;
import com.example.gen20javaspringbootpos.entity.Product;
import com.example.gen20javaspringbootpos.repository.CategoryRepository;
import com.example.gen20javaspringbootpos.repository.CustomerRepository;
import com.example.gen20javaspringbootpos.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository custRepo;


    public CustomerService(){

    }

    public Optional<Customer> findById(int id){

        return custRepo.findById(id);
    }

    public List<Customer> fetchCustList() {
        return custRepo.fetchCustomerAccount();
    }

    public List<Customer> fetchCustListJpq() {
        return custRepo.fetchCustomerAccountJpq();
    }

    public List<Customer> fetchCustList(int id) {
        return custRepo.fetchCustomerAccountJpq(id);
    }

    //public void insertCustomer(Customer c) {
    //    custRepo.save(c);
    //}

    public void insertCustomer(int id,String name,String email,String mobileNumber){custRepo.addCustomerAccount(id,name,email,mobileNumber);}

    public void insertCustomerJpq(int id,String name,String email,String mobileNumber){custRepo.addCustomerAccountJpq(id,name,email,mobileNumber);}

    public void deleteCustomer(int id){ custRepo.deleteById(id);}


}
