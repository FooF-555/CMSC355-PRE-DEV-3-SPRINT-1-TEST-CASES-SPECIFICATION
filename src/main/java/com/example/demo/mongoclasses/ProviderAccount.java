package com.example.demo.mongoclasses;

import java.util.ArrayList;
import java.time.LocalDate;

public class ProviderAccount extends Account{
    ArrayList<PatientAccount> connectedPatients;

    // Default constructor (testing atm)
    public ProviderAccount() {
        super("Jane", "Doe", "test123", "test@gmail.com", 40, "Female", LocalDate.now(), "123-456-7890", "a physician");
        this.connectedPatients = new ArrayList<>();
    }

    public ProviderAccount(String firstName, String lastName, String password, String email, int age, String gender, LocalDate dateOfBirth, String phoneNumber, String additionalInfo, int userID) {
        super(firstName, lastName, password, email, age, gender, dateOfBirth, phoneNumber, additionalInfo);
        this.connectedPatients = new ArrayList<>();
    }

    public ArrayList<PatientAccount> getPatients(){
        return connectedPatients;
    }

    public void addPatient(PatientAccount patient){
        connectedPatients.add(patient);
    }

    //checks if the patient provided is a patient of this provider
    public boolean checkForPatientStatus(PatientAccount potientialPatient){
        String temp = potientialPatient.getEmail();
        for( PatientAccount p : connectedPatients){
            if(p.getEmail().equals(temp)){
                return true;
            }
        }
        return false;
    }

    //for REQ2
    public void sendMessage(String message, PatientAccount patient){
        if (checkForPatientStatus(patient)){
            patient.addNote(new ProviderNote(this, patient, message, "00/00/0000"));
        } else {
            //something about patient not connected to provider
        }
    }
}
