package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.entity.TransactionDetail;
import com.example.gen20javaspringbootpos.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepo;

    public TransactionService() {
    }

    public Optional<TransactionDetail> findById(int id){

        return transactionRepo.findById(id);
    }

    //@Override
    public List<TransactionDetail> fetchTranList() {
        return transactionRepo.findAll();
    }


    public void insertTransaction(TransactionDetail d) {
        transactionRepo.save(d);
    }
}

