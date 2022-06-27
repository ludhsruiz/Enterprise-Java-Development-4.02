package com.ironhack.lab402.controller.interfaces;

import com.ironhack.lab402.enums.Status;
import com.ironhack.lab402.models.Patient;

import java.util.List;

public interface PatientController {

    public List<Patient> findByName(String name);
    public Patient findByPatientId(Integer id);
    public List<Patient> findByDoctorName(String admittedBy);
    public List<Patient> findByDateOfBirthBetween(String startDate, String dateEnd);
    public List<Patient> findByDoctorDepartment(String department);
    public List<Patient> findByDoctorStatusOff(Status status);
}