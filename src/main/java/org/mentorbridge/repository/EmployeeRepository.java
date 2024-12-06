package org.mentorbridge.repository;

import org.mentorbridge.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/**
 * Repository interface for managing EmployeeEntity instances.
 * Extends JpaRepository to provide CRUD operations and
 * additional methods for interacting with the database.

 * The primary managed entity is EmployeeEntity, with Long as the ID type.
 */
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    EmployeeEntity findById(long id);
}