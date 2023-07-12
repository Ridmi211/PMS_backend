package com.hsl.prescription.system.repositories;

import com.hsl.prescription.system.models.ERole;
import com.hsl.prescription.system.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
     Optional<Role> findByName(ERole name);
}
