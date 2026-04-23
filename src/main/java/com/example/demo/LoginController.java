package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.mongoclasses.*;

@Controller
public class LoginController {
    @Autowired
    PatientAccountRepository patientRepo;

    @Autowired
    ProviderAccountRepository providerRepo;

    @PostMapping("/patientLogin")
    public String patientLogin(@RequestParam("firstName") String firstName, @RequestParam("password") String password, Model model) {
        PatientAccount patient = patientRepo.findAccByName(firstName);

        if (patient != null && patient.getPassword().equals(password)) {
            return "patientDashboard";
        }
        else {
            model.addAttribute("error", "Invalid name/password!");
            return "patientLogin";
        }
    }

    @PostMapping("/physicianLogin")
    public String physicianLogin(@RequestParam("firstName") String firstName, @RequestParam("password") String password, Model model) {
        ProviderAccount provider = providerRepo.findAccByName(firstName);

        if (provider != null && provider.getPassword().equals(password)) {
            return "physicianDashboard";
        }
        else {
            model.addAttribute("error", "Invalid name/password!");
            return "physicianLogin";
        }
    }
}
