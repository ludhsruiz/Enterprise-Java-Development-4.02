package com.ironhack.lab402.controller.impl;

import com.ironhack.lab402.controller.interfaces.EmployeeController;
import com.ironhack.lab402.enums.Status;
import com.ironhack.lab402.models.Employee;
import com.ironhack.lab402.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeControllerImpl implements EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    // Get all doctors
    @GetMapping("/doctors")
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    // Get doctor by employee_id
    @GetMapping("/doctor-by-id/{id}")
    public Employee findByEmployeeId(@PathVariable(name = "id") Integer id) {
        return employeeRepository.findByEmployeeId(id);
    }

    // Get doctors by status
    @GetMapping("/doctors-by-status/{status}")
    public List<Employee> findByStatus(@PathVariable(name = "status") Status status) {
        return employeeRepository.findByStatus(status);
    }

    // Get doctors by department
    @GetMapping("/doctors-by-department/{department}")
    public List<Employee> findByDepartment(@PathVariable(name = "department") String department) {
        return employeeRepository.findByDepartment(department);
    }
}