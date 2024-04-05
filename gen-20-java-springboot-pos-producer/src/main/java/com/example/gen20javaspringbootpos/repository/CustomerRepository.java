package com.example.gen20javaspringbootpos.repository;

import com.example.gen20javaspringbootpos.entity.Customer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    //native
    @Modifying
    @Transactional
    @Query(value="INSERT INTO customer VALUES(?1,?2,?3,?4,NOW())",nativeQuery = true)
    void addCustomerAccount(int id,String name,String email,String mobileNumber);

    @Query(value = "SELECT * FROM customer",nativeQuery = true)
    List<Customer> fetchCustomerAccount();

    @Modifying
    @Transactional
    @Query("INSERT INTO Customer c (c.id,c.name,c.email,c.mobileNumber) VALUES(:id,:name,:email,:mobilenum)")
    void addCustomerAccountJpq(@Param("id") int id,@Param("name") String name,@Param("email") String email,@Param("mobilenum") String mobileNumber);

    @Query("SELECT c FROM Customer c")
    List<Customer> fetchCustomerAccountJpq();

    @Query("SELECT c FROM Customer c WHERE c.id=:id")
    List<Customer> fetchCustomerAccountJpq(@Param("id")int id);
}
