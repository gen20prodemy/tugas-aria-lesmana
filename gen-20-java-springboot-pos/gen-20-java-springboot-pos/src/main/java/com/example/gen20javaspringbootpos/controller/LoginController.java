package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.model.AuthenticationRequest;
import com.example.gen20javaspringbootpos.model.AuthenticationResponse;
import com.example.gen20javaspringbootpos.model.RegisterRequest;
import com.example.gen20javaspringbootpos.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/auth")
public class LoginController {

    private final LoginService authServ;

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("Test OK");
    }

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest req){
        return ResponseEntity.ok(authServ.register(req));
    }

    @PostMapping("/auth")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest req){
        return ResponseEntity.ok(authServ.authenticate(req));
    }

    }
