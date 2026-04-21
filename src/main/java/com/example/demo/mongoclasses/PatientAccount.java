package com.example.demo.mongoclasses;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document("PatientAccounts")
public class PatientAccount extends Account{
    //idk if this will be used
    private final int userID;
    ArrayList<ProviderNote> providerNotes;

    //will this include a notes String<> ?
    //for REQ1
    public PatientAccount(String firstName, String lastName, String password, String email, int age, String gender, String dateOfBirth, int phoneNumber, String homeAddress, int userID) {
        super(firstName, lastName, password, email, age, gender, dateOfBirth, phoneNumber, homeAddress);
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }

    public PatientAccount getAccountDetails() {
        System.out.println("//// Account Details of Patient: " + userID +
        "\n// Name: " + firstName + " " + lastName +
        "\n// Email Address: " + email +
        "\n// Age: " + age +
        "\n// Gender: " + gender +
        "\n// Date of Birth: " + dateOfBirth +
        "\n// Phone Number: " + phoneNumber +
        "\n// Home Address: " + homeAddress + "\n");

        return this;
    }

    public void addNote(ProviderNote note){
        providerNotes.add(note);
    }
}
