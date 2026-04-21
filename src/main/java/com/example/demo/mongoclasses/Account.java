package com.example.demo.mongoclasses;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

public class Account {
    protected String firstName;
    protected String lastName;
    protected String password;
    @Id
    protected String email;
    protected int age;
    protected String gender;

    @DateTimeFormat(pattern = "MM-DD-yyyy")
    protected LocalDate dateOfBirth; // In the form of MM/DD/YYYY
    protected String phoneNumber;
    protected String additionalInfo;
    
    public Account(String firstName, String lastName, String password, String email, int age, String gender, LocalDate dateOfBirth, String phoneNumber, String additionalInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.additionalInfo = additionalInfo;
    }


    // Getters
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDOB(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
