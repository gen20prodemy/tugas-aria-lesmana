package com.example.aritmatika.controller;

import com.example.aritmatika.dto.Aritmatika;
import com.example.aritmatika.service.AritmatikaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/add")
public class AdditionController {

    @Autowired
    private AritmatikaService arService;
    @PostMapping("/tambah")
    public int addition(@RequestBody Aritmatika ar){
        return arService.addition(ar.getA(), ar.getB());
    }
}
