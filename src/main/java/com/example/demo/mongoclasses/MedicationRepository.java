package com.example.demo.mongoclasses;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicationRepository extends MongoRepository<Medication, String> {
    List<Medication> findByPatientEmail(String patientEmail);
}
