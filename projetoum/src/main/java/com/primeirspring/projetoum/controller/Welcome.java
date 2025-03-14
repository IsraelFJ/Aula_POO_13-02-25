package com.primeirspring.projetoum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/welcome")
public class Welcome {

    @RequestMapping
    public String welcome() {
        return "Welcome to Primeiro Spring Boot Application - Projeto Um - 2025 (-_･) ︻デ═一' * (/❛o❛)/";
    }
}


//https://img.icons8.com/?size=100&id=JEdjysAt9zpf&format=png&color=000000    icon8 json icon