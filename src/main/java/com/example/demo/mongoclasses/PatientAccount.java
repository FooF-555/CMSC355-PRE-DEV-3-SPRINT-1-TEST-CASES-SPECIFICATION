package com.example.demo.mongoclasses;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("PatientAccounts")
public class PatientAccount extends Account{
    //idk if this will be used
    private int userID;
    /* ArrayList<ProviderNote> providerNotes; */

    // Default constructor (testing atm)
    public PatientAccount() {
        super("John", "Smith", "test123", "test@gmail.com", 40, "Male", LocalDate.now(), "123-456-7890", "got paralyzed");
        userID = 0;
    }

    //will this include a notes String<> ?
    //for REQ1
    public PatientAccount(String firstName, String lastName, String password, String email, int age, String gender, LocalDate dateOfBirth, String phoneNumber, String additionalInfo, int userID) {
        super(firstName, lastName, password, email, age, gender, dateOfBirth, phoneNumber, additionalInfo);
        this.userID = userID;
    }
    

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public PatientAccount getAccountDetails() {
        System.out.println("//// Account Details of Patient: " + userID +
        "\n// Name: " + firstName + " " + lastName +
        "\n// Email Address: " + email +
        "\n// Age: " + age +
        "\n// Gender: " + gender +
        "\n// Date of Birth: " + dateOfBirth +
        "\n// Phone Number: " + phoneNumber +
        "\n// Additional Info: " + additionalInfo + "\n");

        return this;
    }

/*     public void addNote(ProviderNote note){
        providerNotes.add(note);
    } */
}
