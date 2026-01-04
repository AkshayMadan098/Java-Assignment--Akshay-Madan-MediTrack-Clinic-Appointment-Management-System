package com.airtribe.meditrack.controller;

import com.airtribe.meditrack.entity.Patient;
import com.airtribe.meditrack.exception.InvalidDataException;
import com.airtribe.meditrack.service.PatientService;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;


public class PatientController {
    
    private final PatientService patientService;
    

    public PatientController() {
        this.patientService = new PatientService();
    }

    public Patient createPatient(String name, LocalDate dateOfBirth, String email,
                                String phoneNumber, String medicalHistory, String allergies,
                                String insuranceProvider, String insurancePolicyNumber)
            throws InvalidDataException, SQLException {
        return patientService.createPatient(name, dateOfBirth, email, phoneNumber,
                medicalHistory, allergies, insuranceProvider, insurancePolicyNumber);
    }

    public Patient getPatient(int id) throws InvalidDataException, SQLException {
        return patientService.findPatientById(id);
    }

    public List<Patient> getAllPatients() throws SQLException {
        return patientService.getAllPatients();
    }

    public Patient updatePatient(Patient patient) throws InvalidDataException, SQLException {
        return patientService.updatePatient(patient);
    }

    public boolean deletePatient(int id) throws InvalidDataException, SQLException {
        return patientService.deletePatient(id);
    }

    public Patient searchPatientById(int id) throws InvalidDataException, SQLException {
        return patientService.searchPatient(id);
    }

    public List<Patient> searchPatientByName(String name) throws InvalidDataException, SQLException {
        return patientService.searchPatient(name);
    }

    public List<Patient> searchPatientByAge(int age) throws InvalidDataException, SQLException {
        return patientService.searchPatientsByAge(age);
    }
}

