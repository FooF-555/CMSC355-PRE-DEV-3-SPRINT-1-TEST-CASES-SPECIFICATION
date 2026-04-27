package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.mongoclasses.Medication;
import com.example.demo.mongoclasses.MedicationRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class MedicationController {
    @Autowired
    MedicationRepository medicationRepo;

    @GetMapping("/patientMedications")
    public String getMedications(Model model, HttpSession session) {

        String email = (String) session.getAttribute("loggedInUser");

        if (email == null) {
            return "redirect:/patientLogin";
        }

        List<Medication> meds = medicationRepo.findByPatientEmail(email);

        model.addAttribute("medications", meds);

        return "patientMedications";
    }

    @GetMapping("/addMedication")
    public String showAddMedicationPage() {
        return "addMedication";
    }

    @PostMapping("/addMedication")
    public String addMedication(@RequestParam String patientEmail,
                                @RequestParam String medicationName,
                                @RequestParam String dosage,
                                @RequestParam String frequency,
                                HttpSession session) {

        String email = (String) session.getAttribute("loggedInUser");

        if (email == null) {
            return "redirect:/physicianLogin";
        }

        Medication med = new Medication();
        med.setPatientEmail(patientEmail);
        med.setMedicationName(medicationName);
        med.setDosage(dosage);
        med.setFrequency(frequency);

        medicationRepo.save(med);

        return "redirect:/physicianDashboard";
    }
}
