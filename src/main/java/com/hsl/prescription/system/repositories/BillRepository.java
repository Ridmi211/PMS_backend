package com.hsl.prescription.system.repositories;

import com.hsl.prescription.system.models.Bill;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
public interface BillRepository extends MongoRepository<Bill, String> {
    Bill findBillByPatientNIC(String patientNIC);
    Bill findBillByPatientName(String patientName);
    List<Bill> findAllByPatientNIC(String patientNIC);

}
