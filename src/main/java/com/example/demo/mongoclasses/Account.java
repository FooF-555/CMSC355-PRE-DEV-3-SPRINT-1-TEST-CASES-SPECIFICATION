package com.example.demo.mongoclasses;

import org.springframework.data.annotation.Id;

public class Account {
    protected String firstName;
    protected String lastName;
    protected String password;
    @Id
    protected String email;
    protected int age;
    protected String gender;
    protected String dateOfBirth; // In the form of MM/DD/YYYY
    protected int phoneNumber;
    protected String homeAddress;
    
    public Account(String firstName, String lastName, String password, String email, int age, String gender, String dateOfBirth, int phoneNumber, String homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
    }


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

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

}
