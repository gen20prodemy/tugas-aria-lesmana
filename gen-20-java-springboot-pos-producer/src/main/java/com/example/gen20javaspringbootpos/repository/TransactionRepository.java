package com.example.gen20javaspringbootpos.repository;


import com.example.gen20javaspringbootpos.entity.TransactionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionDetail, Integer> {


}

