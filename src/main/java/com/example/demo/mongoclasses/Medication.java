package com.example.demo.mongoclasses;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Medications")
public class Medication {
    @Id
    private String ID;

    private String patientEmail;  // or patientId
    private String medicationName;
    private String dosage;
    private String frequency;

    // Getters
    public String getID() {
        return ID;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    // Setters

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
}
