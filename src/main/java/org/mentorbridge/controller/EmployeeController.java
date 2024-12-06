package org.mentorbridge.controller;

import org.mentorbridge.dto.EmployeeDTO;
import org.mentorbridge.entity.EmployeeEntity;
import org.mentorbridge.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 * REST controller for handling employee-related operations.
 * Allows clients to perform operations such as adding new employees.
 * Annotations:
 * - @RestController: Indicates that this class is a REST controller and
 *   will handle HTTP requests.
 * - @Autowired: Marks a field to be auto-wired by Spring's dependency
 *   injection facilities.
 * Operations:
 * - addEmployee: Accepts a POST request to add a new employee to the
 *   system.
 */
@RestController //???
public class EmployeeController {
    @Autowired//required injection loosly coupled
    private EmployeeService employeeService;

    @PostMapping("/addEmployeeTo")
    public EmployeeDTO addEmployeeTo(@RequestBody EmployeeDTO employeeDTO) {
        System.out.println("Employee added: " + employeeDTO);
        return employeeService.addEmployee(employeeDTO);
    }

    @GetMapping("/get/{id}")
    public EmployeeDTO getEmployee(@PathVariable long id) {
        return employeeService.getEmployee(id);
    }

}