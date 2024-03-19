package com.example.aritmatika.controller;

import com.example.aritmatika.dto.Aritmatika;
import com.example.aritmatika.service.AritmatikaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/sub")
public class SubtractController {

    @Autowired
    private AritmatikaService arService;
    @PostMapping("/kurang")
    public int addition(@RequestBody Aritmatika ar){
        return arService.subtract(ar.getA(), ar.getB());
    }
}
