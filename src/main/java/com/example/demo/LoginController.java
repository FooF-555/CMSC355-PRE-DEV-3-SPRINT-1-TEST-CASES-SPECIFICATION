package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.mongoclasses.PatientAccount;
import com.example.demo.mongoclasses.PatientAccountRepository;
import com.example.demo.mongoclasses.ProviderAccount;
import com.example.demo.mongoclasses.ProviderAccountRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    PatientAccountRepository patientRepo;

    @Autowired
    ProviderAccountRepository providerRepo;

    @PostMapping("/patientLogin")
    public String patientLogin(@RequestParam("firstName") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        PatientAccount patient = patientRepo.findAccByEmail(email);

        if (patient != null && patient.getPassword().equals(password)) {
            session.setAttribute("loggedInUser", patient.getEmail());
            return "redirect:/patientDashboard";
        }
        else {
            return "patientLogin";
        }
    }

    @PostMapping("/physicianLogin")
    public String physicianLogin(@RequestParam("firstName") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        ProviderAccount provider = providerRepo.findAccByEmail(email);

        if (provider != null && provider.getPassword().equals(password)) {
            session.setAttribute("loggedInUser", provider.getEmail());
            return "redirect:/physicianDashboard";
        }
        else {
            return "physicianLogin";
        }
    }
}
