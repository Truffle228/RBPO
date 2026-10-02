package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class MyController {

    @GetMapping("/text")
    public String getText() {
        return "Привет! Это текстовый ответ от Spring Boot.";
    }

    @GetMapping("/numbers")
    public List<Integer> getNumbers() {
        return Arrays.asList(1, 2, 3, 4, 5, 10, 20, 30);
    }
}
