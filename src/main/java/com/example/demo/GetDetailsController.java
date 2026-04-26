package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.mongoclasses.PatientAccount;
import com.example.demo.mongoclasses.PatientAccountRepository;

@Controller
public class GetDetailsController {
    PatientAccountRepository patientRepo;
    /* ProviderAccountRepository providerRepo; */

    @PostMapping("/patientGetDetails")
    public String postMethodName(@RequestParam("firstName") String email, Model model) {
        PatientAccount patient = patientRepo.findAccByEmail(email);

        model.addAttribute("patient", patient);
        return "patientGetDetails";
    }
    
}
