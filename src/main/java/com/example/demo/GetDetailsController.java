package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.mongoclasses.PatientAccount;
import com.example.demo.mongoclasses.PatientAccountRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class GetDetailsController {
    @Autowired
    PatientAccountRepository patientRepo;
    /* ProviderAccountRepository providerRepo; */

    @GetMapping("/patientGetDetails")
    public String showPatientYourDetails(Model model, HttpSession session) {
        String email = (String)session.getAttribute("loggedInUser");

        if (email == null) {
            return "redirect:/patientLogin"; // not logged in
        }

        PatientAccount patient = patientRepo.findAccByEmail(email);

        model.addAttribute("patient", patient);

        return "patientGetDetails";
    }
    
}
