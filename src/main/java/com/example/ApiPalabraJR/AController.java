package com.example.ApiPalabraJR;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {

    @GetMapping("/")
    public String hola() {
        return "hola";
    }
}
