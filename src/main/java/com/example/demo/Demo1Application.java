package com.example.demo;

import java.time.LocalDate;

import com.example.demo.mongoclasses.PatientAccount;
import com.example.demo.mongoclasses.PatientAccountRepository;
import com.example.demo.mongoclasses.ProviderAccount;
import com.example.demo.mongoclasses.ProviderAccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
/* import org.springframework.boot.CommandLineRunner; */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Demo1Application {

    @Autowired
    PatientAccountRepository patientRepo;

    @Autowired
    ProviderAccountRepository providerRepo;

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

/*     @Override
    public void run(String... args){
        smth();
    } */

    public void smth(){
        patientRepo.save(new PatientAccount("first", "last", "p", "d@mail.com",
                99, "g", LocalDate.now(), "123-456-7890", "other info", 123));
        PatientAccount patient = patientRepo.findAccByEmail("d@mail.com");

        ProviderAccount doc = new ProviderAccount("f", "l", "p", "g@email.com", 9, "g", LocalDate.now(), "123-456-7890"
                , "hose", 456);

        providerRepo.save(doc);

        doc.addPatient(patient);
        providerRepo.save(doc);//saves the changes done by method call

        System.out.println(doc.checkForPatientStatus(patient));

    }
}