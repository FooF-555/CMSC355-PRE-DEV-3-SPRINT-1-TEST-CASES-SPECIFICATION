package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//default is index.html
@Controller
public class WebController {
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

    @GetMapping("/signup")
    public String showSignUp() {
        return "signup";
    }
    
    @GetMapping("/signupOptions")
    public String showSignUpOptions() {
        return "signupOptions";
    }

    @GetMapping("/patientSignUp")
    public String showPatientSignUp() {
        return "patientSignUp";
    }

    @GetMapping("/physicianSignUp")
    public String showPhysicianSignUp() {
        return "physicianSignUp";
    }

    @GetMapping("/")
    public String showIndex(Model model){
        model.addAttribute("name", "dr mann");
        return "index";
    }
}
