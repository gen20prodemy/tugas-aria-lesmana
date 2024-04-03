package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.entity.Product;
import com.example.gen20javaspringbootpos.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/page")
public class SecureController {

    @Autowired
    private ProductService prodServ;

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("Test OK");
    }

}
