package com.example.gen20javaspringbootservlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class IndexController {

    @GetMapping("/index")
    public String greet(Model model){

        String msg="Hello World Thymeleaf";
        model.addAttribute("msg",msg);
        return "index";
    }

}
