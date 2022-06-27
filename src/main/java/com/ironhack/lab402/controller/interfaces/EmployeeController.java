package com.ironhack.lab402.controller.interfaces;

import com.ironhack.lab402.enums.Status;
import com.ironhack.lab402.models.Employee;

import java.util.List;

public interface EmployeeController {

    public Employee findByEmployeeId(Integer employeeId);
    public List<Employee> findByStatus(Status status);
    public List<Employee> findByDepartment(String department);
}

