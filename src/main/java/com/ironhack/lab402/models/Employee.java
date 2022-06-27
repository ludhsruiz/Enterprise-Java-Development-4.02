package com.ironhack.lab402.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ironhack.lab402.enums.Status;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    private Integer employeeId;
    private String department;
    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToMany(mappedBy="admittedBy")
    @JsonIgnore
    private List<Patient> patientList;

    public Employee() {
    }

    public Employee(Integer employeeId, String department, String name, Status status) {
        this.employeeId = employeeId;
        this.department = department;
        this.name = name;
        this.status = status;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
