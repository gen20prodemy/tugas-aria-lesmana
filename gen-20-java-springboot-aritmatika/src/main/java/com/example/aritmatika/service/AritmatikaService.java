package com.example.aritmatika.service;

import org.springframework.stereotype.Service;

@Service
public class AritmatikaService {

    public AritmatikaService(){

    }

    public int addition(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public int division(int a,int b){
        if (b==0){
            throw new ArithmeticException("Divide by zero");
        }
        return a/b;
    }

}
