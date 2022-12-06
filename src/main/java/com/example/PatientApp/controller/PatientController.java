package com.example.PatientApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @GetMapping("/viewall")
    public String ViewPatients(){
        return "Welcome to view";
    }
}
