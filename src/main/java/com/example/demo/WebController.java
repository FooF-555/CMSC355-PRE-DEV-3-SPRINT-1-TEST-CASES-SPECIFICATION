package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.mongoclasses.PatientAccount;
import com.example.demo.mongoclasses.ProviderAccount;



@Controller
public class WebController {
    // Login Options
    @GetMapping("/loginOptions")
    public String showLoginOptions() {
        return "loginOptions";
    }

    @GetMapping("/patientLogin")
    public String showPatientLogin() {
        return "patientLogin";
    }

    @GetMapping("/physicianLogin")
    public String showPhysicianLogin() {
        return "physicianLogin";
    }

    // Sign Up Options 
    @GetMapping("/signupOptions")
    public String showSignUpOptions() {
        return "signupOptions";
    }

    @GetMapping("/patientSignUp")
    public String showPatientSignUp(Model model) {
        model.addAttribute("patient", new PatientAccount());
        return "patientSignUp";
    }

    @GetMapping("/physicianSignUp")
    public String showPhysicianSignUp(Model model) {
        model.addAttribute("physician", new ProviderAccount());
        return "physicianSignUp";
    }

    // Patient Dashboard Navigation
    @GetMapping("/patientDashboard")
    public String showPatientDashboard() {
        return "patientDashboard";
    }

    // Physician Dashboard Navigation
    @GetMapping("/physicianDashboard")
    public String showPhysicianDashboard() {
        return "physicianDashboard";
    }
}
