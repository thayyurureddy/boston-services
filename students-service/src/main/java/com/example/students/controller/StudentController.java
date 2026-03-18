package com.example.students.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping
    public List<String> getStudents() {
        return Arrays.asList("Alice", "Bob", "Charlie", "Diana");
    }
}
