package com.example.demo.mongoclasses;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PatientAccountRepository extends MongoRepository<PatientAccount, String> {

    @Query("{email:'?0'}")
    PatientAccount findAccByEmail(String email);

}
