package com.hsl.prescription.system.repositories;


import com.hsl.prescription.system.models.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PrescriptionRepository extends MongoRepository<Prescription, String> {

    Prescription findByPatientName(String patientName);
    List<Prescription> findByPatientNIC(String patientNIC);
}
