package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



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
    

/*  @GetMapping("/signupOptions")
    public String showSignUpOptions() {
        return "signupOptions";
    }

    @GetMapping("/signupPatient")
    public String showPatientSignUp() {
        return "signupPatient";
    }

    @GetMapping("/signupPhysician")
    public String showPhysicianSignUp() {
        return "physicianSignUp";
    } */
}
