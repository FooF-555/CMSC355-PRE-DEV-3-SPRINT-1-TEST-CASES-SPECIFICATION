package production;

import java.util.*;

public class PhysicianAccount {
    // Patient Fields
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String gender;
    private int phoneNumber;
    private final int physicianID;

    // Constructor
    public PhysicianAccount(String firstName, String lastName, String password, String email, int phoneNumber, int physicianID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.physicianID = physicianID;
    }

    /////// Getter Methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getPhysicianID() {
        return physicianID;
    }

    ///////////////////////////////////////////
    /// Getting patient details
    public void getAccountDetails() {
        System.out.println("//// Account Details of Physician: " + physicianID +
        "\n// Name: " + firstName + " " + lastName +
        "\n// Email Address: " + email +
        "\n// Phone Number: " + phoneNumber + "\n");
    }
}
