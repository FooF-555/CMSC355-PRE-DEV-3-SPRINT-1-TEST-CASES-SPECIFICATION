package com.example.demo.mongoclasses;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ProviderAccountRepository extends MongoRepository<ProviderAccount, String> {

    @Query("{email:'?0'}")
    ProviderAccount findAccByEmail(String email);

}
