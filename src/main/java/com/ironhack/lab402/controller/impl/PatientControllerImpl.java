package com.ironhack.lab402.controller.impl;

import com.ironhack.lab402.controller.interfaces.PatientController;
import com.ironhack.lab402.enums.Status;
import com.ironhack.lab402.models.Patient;
import com.ironhack.lab402.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.List;

public class PatientControllerImpl implements PatientController {
    @Autowired
    private PatientRepository patientRepository;

    // Get all patients
    @GetMapping("/all-patients")
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    // Get patients by name
    @GetMapping("/patients/{name}")
    public List<Patient> findByName(@PathVariable(name="name") String name) {
        return patientRepository.findByName(name);
    }

    // Get a patient by patient_id
    @GetMapping("patient-by-id/{id}")
    public Patient findByPatientId(@PathVariable(name="id")Integer id) {
        return patientRepository.findByPatientId(id);
    }

    // Get patients by doctor
    @GetMapping("patient-by-doctor/{name}")
    public List<Patient> findByDoctorName(@PathVariable(name="name") String name) {
        return patientRepository.findByDoctorName(name);
    }

    // Get patients date of birth within a specified range
    @GetMapping("patient-by-range/{dateStart}/{dateEnd}")
    public List<Patient> findByDateOfBirthBetween(@PathVariable(name="dateStart") String startDate, @PathVariable(name="dateEnd") String dateEnd) {
        return patientRepository.findByDateOfBirthBetween(LocalDate.parse(startDate), LocalDate.parse(dateEnd));
    }

    // Get patients by department that their admitting doctor is in
    @GetMapping("patients-by-department/{department}")
    public List<Patient> findByDoctorDepartment(@PathVariable(name="department")String department) {
        return patientRepository.findByDoctorDepartment(department);
    }

    // Get all patients with a doctor whose status is OFF
    @GetMapping("patients-by-doctor-status/{status}")
    public List<Patient> findByDoctorStatusOff(@PathVariable(name="status") Status status) {
        return patientRepository.findByDoctorStatusOff(status);
    }
}
