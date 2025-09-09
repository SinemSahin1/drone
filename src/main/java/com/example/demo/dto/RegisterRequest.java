package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RegisterRequest {
    private String email;
    private String firstName;
    private String lastName;
    private String password;
}
