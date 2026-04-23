package com.example.demo.mongoclasses;

public class ProviderNote {
    String auth;
    PatientAccount recipient;
    String date;
    String body;


    public ProviderNote(String providerEmail, String body, String date){
        this.auth = providerEmail;
        this.date = date;
        this.body = body;
    }
}
