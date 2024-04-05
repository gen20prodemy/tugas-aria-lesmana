package com.example.gen20javaspringbootpos.controller;


import com.example.gen20javaspringbootpos.entity.Product;
import com.example.gen20javaspringbootpos.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    RedisService redisService;

    @PostMapping("/save")
    public ResponseEntity<String> saveItem(@RequestBody Product prod){
        boolean result=redisService.saveItem(prod);
        if(result){
            return ResponseEntity.ok("Save ops sucess");
        }else return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Product>> getAll(){
        List<Product> pl;
        pl = redisService.getAll();
        return ResponseEntity.ok(pl);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Product> getItem(@PathVariable("id") int id){
        Product p = redisService.getItem(id);
        return ResponseEntity.ok(p);
    }
    @GetMapping("/delete/{id}")
    public ResponseEntity<String> deleteItem(@PathVariable("id") int id){
        boolean result=redisService.deleteItem(id);
        if(result){
            return ResponseEntity.ok(String.format("ID %s deleted", id));
        }else return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

    }
}
