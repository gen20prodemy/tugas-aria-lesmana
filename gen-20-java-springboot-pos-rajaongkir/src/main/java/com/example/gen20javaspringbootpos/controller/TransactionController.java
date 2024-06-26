package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.model.ResponseFormat;
import com.example.gen20javaspringbootpos.entity.TransactionDetail;
import com.example.gen20javaspringbootpos.repository.TransactionRepository;
import com.example.gen20javaspringbootpos.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@ComponentScan({"com.gen-20-java-springboot-pos."})
@RequestMapping(path="api/transaction")
@RestController
public class TransactionController{

    @Autowired
    @Qualifier("transactionService")
    private TransactionService transactionService;
    @Autowired
    private TransactionRepository tranRepo;

    @PostMapping("/byid")
    public Optional<TransactionDetail> findById(int id){
        return transactionService.findById(id);
    }

    //method API Select
    @PostMapping("/showall")
    public List<TransactionDetail> fetchTranList() {
        return transactionService.fetchTranList();
    }


    //method API insert
    @PostMapping("/insert")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseFormat insertTransaction(@RequestBody TransactionDetail tr) {
        transactionService.insertTransaction(tr);
        return new ResponseFormat(HttpStatus.CREATED.value(),"Berhasil Insert");
    }

}
