package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.controller.config.JwtAuthFilter;
import com.example.gen20javaspringbootpos.entity.Role;
import com.example.gen20javaspringbootpos.entity.User;
import com.example.gen20javaspringbootpos.model.AuthenticationRequest;
import com.example.gen20javaspringbootpos.model.AuthenticationResponse;
import com.example.gen20javaspringbootpos.model.RegisterRequest;
import com.example.gen20javaspringbootpos.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserRepository userRepo;

    //List<User> userRepo;

    private final PasswordEncoder passEnc;
    private final JwtService jwtServ;
    private final AuthenticationManager authManager;

    //public LoginService(){
    //    User u1= new User("Admin","admin", Role.ADMIN);
    //    User u2 = new User("User1","password",Role.USER);
    //}

    /*public User findByUsername(String uname){
        User out;
        for (User u:userRepo) {
            if(u.getUsername()==uname){
                out=u;
                return out;
            }
        }
        return null;
    }*/

    public AuthenticationResponse register(RegisterRequest req){
        var user = User.builder()
                .username(req.getUsername())
                .password(passEnc.encode(req.getPassword()))
                .role(Role.USER)
                .build();
        userRepo.save(user);
        var jwtToken = jwtServ.generateToken(user);
        return AuthenticationResponse.builder().token(jwtToken).build();

    }

    public AuthenticationResponse authenticate(AuthenticationRequest req){

        authManager.authenticate(new UsernamePasswordAuthenticationToken(
                req.getUsername(),req.getPassword()
        ));

        var user = userRepo.findByUsername(req.getUsername()).orElseThrow();
        var jwtToken = jwtServ.generateToken(user);
        return AuthenticationResponse.builder().token(jwtToken).build();
    }
}
