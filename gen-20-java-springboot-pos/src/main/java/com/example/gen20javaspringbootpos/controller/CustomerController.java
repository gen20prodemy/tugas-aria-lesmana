package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.entity.Customer;
import com.example.gen20javaspringbootpos.model.ResponseFormat;
import com.example.gen20javaspringbootpos.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@ComponentScan({"com.gen-20-java-springboot-pos."})
@RequestMapping(path="apicust")
@RestController
public class CustomerController {

    @Autowired
    @Qualifier("customerService")
    private CustomerService custService;

    @PostMapping("/custid")
    public Optional<Customer> findById(@RequestParam int id){
        return custService.findById(id);
    }

    //@PostMapping("/byname")
    //public List<Customer> findCatName(String name) {
    //    return custService.findByName(name);
    //}
    //method API Select
    @PostMapping("/allcust")
    public List<Customer> fetchCustList() {
        return custService.fetchCustList();
    }

    @PostMapping("cust/{id}")
    public List<Customer> fetchCustList(@PathVariable("id")int id) {
        return custService.fetchCustList(id);
    }
    //method API insert
    @PostMapping("/insert")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseFormat insertCustomer(@RequestBody Customer cust) {
        custService.insertCustomer(cust.getId(), cust.getName(), cust.getEmail(),cust.getMobileNumber());
        return new ResponseFormat(HttpStatus.CREATED.value(),"Berhasil Insert");
    }

    @PostMapping("/insertjpq")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseFormat insertCustomerJpq(@RequestBody Customer cust) {
        custService.insertCustomerJpq(cust.getId(), cust.getName(), cust.getEmail(),cust.getMobileNumber());
        return new ResponseFormat(HttpStatus.CREATED.value(),"Berhasil Insert");
    }

    @PostMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    public ResponseFormat deleteCustomer(int id){
        custService.deleteCustomer(id);
        return new ResponseFormat(HttpStatus.OK.value(),"Berhasil Delete");
    }
}

