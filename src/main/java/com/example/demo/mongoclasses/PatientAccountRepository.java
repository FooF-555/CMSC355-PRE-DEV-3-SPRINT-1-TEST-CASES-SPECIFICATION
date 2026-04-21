package com.example.demo.mongoclasses;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PatientAccountRepository extends MongoRepository<PatientAccount, String> {

    @Query("{firstName:'?0'}")
    PatientAccount findAccByName(String name);

}
