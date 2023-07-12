package com.hsl.prescription.system.repositories;


import com.hsl.prescription.system.models.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface PatientRepository extends MongoRepository<Patient, String> {
   Patient findByPatientName(String patientName);
   Patient findByPatientNIC(String patientNIC);

}
