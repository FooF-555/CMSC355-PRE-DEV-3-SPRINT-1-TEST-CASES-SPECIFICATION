package com.example.demo;

import com.example.demo.mongoclasses.PatientAccount;
import com.example.demo.mongoclasses.PatientAccountRepository;
import com.example.demo.mongoclasses.ProviderAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Demo1Application implements CommandLineRunner{

    @Autowired
    PatientAccountRepository patientRepo;

    public static void main(String[] args) {

        SpringApplication.run(Demo1Application.class, args);
    }

    @Override
    public void run(String... args){
        smth();
    }

    public void smth(){
        patientRepo.save(new PatientAccount("first", "last", "p", "d@mail.com",
                99, "g", "f", 2, "home", 123));
        PatientAccount patient = patientRepo.findAccByName("first");

        ProviderAccount doc = new ProviderAccount("f", "l", "p", "g@email.com", 9, "g", "f", 2
        , "hose", 456);
    }
}
