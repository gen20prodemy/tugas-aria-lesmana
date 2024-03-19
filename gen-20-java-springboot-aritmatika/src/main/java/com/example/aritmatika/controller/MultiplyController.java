package com.example.aritmatika.controller;

import com.example.aritmatika.dto.Aritmatika;
import com.example.aritmatika.service.AritmatikaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/mult")
public class MultiplyController {

    @Autowired
    private AritmatikaService arService;
    @PostMapping("/kali")
    public int addition(@RequestBody Aritmatika ar){
        return arService.multiply(ar.getA(), ar.getB());
    }
}
