package com.example.demo.mongoclasses;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ProviderAccountRepository extends MongoRepository<ProviderAccount, String> {

    @Query("{firstName:'?0'}")
    ProviderAccount findAccByName(String name);

}
