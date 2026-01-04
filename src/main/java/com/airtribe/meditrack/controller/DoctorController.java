package com.airtribe.meditrack.controller;

import com.airtribe.meditrack.constants.Specialization;
import com.airtribe.meditrack.entity.Doctor;
import com.airtribe.meditrack.exception.InvalidDataException;
import com.airtribe.meditrack.service.DoctorService;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class DoctorController {
    
    private final DoctorService doctorService;
    
    public DoctorController() {
        this.doctorService = new DoctorService();
    }

    public Doctor createDoctor(String name, LocalDate dateOfBirth, String email,
                              String phoneNumber, Specialization specialization,
                              double consultationFee, int experienceYears, String licenseNumber)
            throws InvalidDataException, SQLException {
        return doctorService.createDoctor(name, dateOfBirth, email, phoneNumber,
                specialization, consultationFee, experienceYears, licenseNumber);
    }

    public Doctor getDoctor(int id) throws InvalidDataException, SQLException {
        return doctorService.findDoctorById(id);
    }

    public List<Doctor> getAllDoctors() throws SQLException {
        return doctorService.getAllDoctors();
    }

    public Doctor updateDoctor(Doctor doctor) throws InvalidDataException, SQLException {
        return doctorService.updateDoctor(doctor);
    }

    public boolean deleteDoctor(int id) throws InvalidDataException, SQLException {
        return doctorService.deleteDoctor(id);
    }

    public List<Doctor> searchDoctorsBySpecialization(Specialization specialization)
            throws InvalidDataException, SQLException {
        return doctorService.searchDoctorsBySpecialization(specialization);
    }

    public List<Doctor> searchDoctorsByName(String name) throws InvalidDataException, SQLException {
        return doctorService.searchDoctorsByName(name);
    }

    public Doctor searchDoctorById(int id) throws InvalidDataException, SQLException {
        return doctorService.searchDoctorById(id);
    }
}

