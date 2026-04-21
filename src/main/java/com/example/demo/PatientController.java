package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.mongoclasses.PatientAccountRepository;
import com.example.demo.mongoclasses.PatientAccount;

@Controller
public class PatientController {
    @Autowired
    PatientAccountRepository patientRepo;

    @PostMapping("/patientSignUp")
    public PatientAccount submitPatient(@ModelAttribute PatientAccount patient) {
        return patientRepo.save(patient);
    }
}
