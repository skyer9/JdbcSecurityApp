package com.example.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MakeBCryptPassword {

    public static void main(String[] args) {

        String password = "222";

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);
        System.out.println(hashedPassword);
        System.out.println(passwordEncoder.matches("222", hashedPassword));
    }
}
