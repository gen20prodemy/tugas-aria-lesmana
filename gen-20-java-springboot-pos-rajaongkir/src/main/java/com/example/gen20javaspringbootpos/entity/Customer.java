package com.example.gen20javaspringbootpos.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity(name="Customer")
public class Customer {
    @Id
    int id;
    String name;
    String email;
    String mobileNumber;
    LocalDate joinDate;

    public Customer(){}

    public Customer(int id, String name, String email, String mobileNumber){
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.joinDate = LocalDate.now();
    }
    public Customer(int id, String name, String email, String mobileNumber, LocalDate joinDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.joinDate = joinDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }


}
