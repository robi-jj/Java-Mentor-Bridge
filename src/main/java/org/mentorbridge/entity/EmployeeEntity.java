package org.mentorbridge.entity;

import java.time.LocalDate;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Represents an entity mapped to the "EMPLOYEE" table in the database.
 * This class is a JPA entity and is managed by the JPA provider.

 * It includes various employee-related attributes such as id, first name,
 * last name, email, phone number, address, and role within the organization.

 * The class also utilizes Lombok annotations for boilerplate code reduction
 * such as getters, setters, and builders.

 * Annotations:
 * - @Entity: Specifies that the class is an entity and is mapped to a database table.
 * - @Table: Specifies the primary table for the annotated entity.
 * - @Data: Lombok annotation to generate getters, setters, and other utility methods.
 * - @Builder: Lombok annotation to provide a builder pattern for object creation.
 * - @NoArgsConstructor: Lombok annotation to create a no-argument constructor.
 * - @AllArgsConstructor: Lombok annotation to create an all-arguments constructor.

 * SQL Table Mapping:
 * - Name: EMPLOYEE

 * Fields:
 * - id: Primary key with auto-generation strategy.
 * - firstName: First name of the employee.
 * - lastName: Last name of the employee.
 * - email: Email address of the employee.
 * - phone: Contact phone number of the employee.
 * - address: Home or other address related to the employee.
 * - role: Job role or title of the employee within the organization.
 */
@Document(value = "EMPLOYEE")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {

    @Id
    private long id;//Long

//    @Column(name = "FIRST_NAME")
    private String firstName;
//
//    @Column(name = "LAST_NAME")
    private String lastName;
//
//    @Column(name = "EMAIL")
    private String email;
//
//    @Column(name = "PHONE")
    private String phone;
//
//    @Column(name = "ADDRESS")
    private String address;
//
//    @Column(name = "ROLE")
    private String role;

}