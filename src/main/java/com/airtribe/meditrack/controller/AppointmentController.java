package com.airtribe.meditrack.controller;

import com.airtribe.meditrack.constants.AppointmentStatus;
import com.airtribe.meditrack.entity.Appointment;
import com.airtribe.meditrack.entity.Bill;
import com.airtribe.meditrack.entity.BillSummary;
import com.airtribe.meditrack.exception.AppointmentNotFoundException;
import com.airtribe.meditrack.exception.InvalidDataException;
import com.airtribe.meditrack.service.AppointmentService;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;


public class AppointmentController {
    
    private final AppointmentService appointmentService;

    public AppointmentController() {
        this.appointmentService = new AppointmentService();
    }

    public Appointment createAppointment(int patientId, int doctorId,
                                        LocalDateTime appointmentDateTime,
                                        String reason, String notes)
            throws InvalidDataException, SQLException {
        return appointmentService.createAppointment(patientId, doctorId,
                appointmentDateTime, reason, notes);
    }

    public Appointment getAppointment(int id)
            throws AppointmentNotFoundException, InvalidDataException, SQLException {
        return appointmentService.findAppointmentById(id);
    }

    public List<Appointment> getAllAppointments() throws SQLException {
        return appointmentService.getAllAppointments();
    }
    

    public List<Appointment> getAppointmentsByPatientId(int patientId)
            throws InvalidDataException, SQLException {
        return appointmentService.getAppointmentsByPatientId(patientId);
    }
    

    public List<Appointment> getAppointmentsByDoctorId(int doctorId)
            throws InvalidDataException, SQLException {
        return appointmentService.getAppointmentsByDoctorId(doctorId);
    }

    public Appointment cancelAppointment(int appointmentId)
            throws AppointmentNotFoundException, InvalidDataException, SQLException {
        return appointmentService.cancelAppointment(appointmentId);
    }
    

    public Appointment confirmAppointment(int appointmentId)
            throws AppointmentNotFoundException, InvalidDataException, SQLException {
        return appointmentService.confirmAppointment(appointmentId);
    }

    public Bill createBill(int appointmentId)
            throws AppointmentNotFoundException, InvalidDataException, SQLException {
        return appointmentService.createBill(appointmentId);
    }

    public BillSummary generateBillSummary(int appointmentId)
            throws AppointmentNotFoundException, InvalidDataException, SQLException {
        return appointmentService.generateBillSummary(appointmentId);
    }

}

