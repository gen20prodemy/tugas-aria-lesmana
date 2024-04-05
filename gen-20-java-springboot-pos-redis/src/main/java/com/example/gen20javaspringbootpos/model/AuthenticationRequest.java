package com.example.gen20javaspringbootpos.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AuthenticationRequest {
    String username;
    String password;
}
