package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.mongoclasses.*;

@Controller
public class SignUpController {
    @Autowired
    PatientAccountRepository patientRepo;

    @Autowired
    ProviderAccountRepository providerRepo;

    @PostMapping("/patientSignUp")
    public String submitPatient(@ModelAttribute PatientAccount patient) {
        patientRepo.save(patient);
        return "patientDashboard";
    }

    @PostMapping("/physicianSignUp")
    public String submitPatient(@ModelAttribute ProviderAccount provider) {
        providerRepo.save(provider);
        return "physicianDashboard";
    }
}
