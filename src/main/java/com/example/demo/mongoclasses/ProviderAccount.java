package com.example.demo.mongoclasses;

import java.util.ArrayList;

public class ProviderAccount extends Account{
    ArrayList<PatientAccount> connectedPatients;

    public ProviderAccount(String firstName, String lastName, String password, String email, int age, String gender, String dateOfBirth, int phoneNumber, String homeAddress, int userID) {
        super(firstName, lastName, password, email, age, gender, dateOfBirth, phoneNumber, homeAddress);
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
}
