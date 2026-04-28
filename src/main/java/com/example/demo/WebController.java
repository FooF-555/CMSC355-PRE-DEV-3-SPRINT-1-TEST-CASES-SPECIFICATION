package com.example.demo;

import com.example.demo.mongoclasses.ProviderAccountRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.mongoclasses.PatientAccount;
import com.example.demo.mongoclasses.ProviderAccount;


@Controller
public class WebController {
    @Autowired
    private ProviderAccountRepository providerRepo;

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

    @GetMapping("/physicianGetDetails")
    public String showPhysicianDetails(HttpSession session, Model model) {
        // Get the stored email from login
        String email = (String) session.getAttribute("loggedInUser");

        if (email != null) {
            ProviderAccount physician = providerRepo.findAccByEmail(email);

            if (physician != null) {
                model.addAttribute("physician", physician);
                return "physicianGetDetails";
            }
        }

        // If no one is logged in, send them back to login
        return "redirect:/physicianLogin";
    }
}
