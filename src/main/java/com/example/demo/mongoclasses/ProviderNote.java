package com.example.demo.mongoclasses;

public class ProviderNote {
    ProviderAccount auth;
    PatientAccount recipient;
    String date;
    String body;


    public ProviderNote(ProviderAccount provider, PatientAccount patient, String body, String date){
        this.auth = provider;
        this.recipient = patient;
        this.date = date;
        this.body = body;
    }
}
