package com.example.PatientApp.controller;

import com.example.PatientApp.dao.PatientDao;
import com.example.PatientApp.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientDao dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Patient> ViewPatients(){
        return (List<Patient>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", produces = "application/json", consumes = "application/json")
    public String AddPatient(@RequestBody Patient p) {
        dao.save(p);
        return "{'status':'success'}";
    }
}
