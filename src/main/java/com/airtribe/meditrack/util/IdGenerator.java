package com.airtribe.meditrack.util;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {
    
    private static volatile IdGenerator instance;
    private final AtomicInteger patientIdCounter;
    private final AtomicInteger doctorIdCounter;
    private final AtomicInteger appointmentIdCounter;
    private final AtomicInteger billIdCounter;
    
    private IdGenerator() {
        patientIdCounter = new AtomicInteger(1000);
        doctorIdCounter = new AtomicInteger(2000);
        appointmentIdCounter = new AtomicInteger(3000);
        billIdCounter = new AtomicInteger(4000);
    }

    static IdGenerator getInstance() {
        if (instance == null) {
            synchronized (IdGenerator.class) {
                if (instance == null) {
                    instance = new IdGenerator();
                }
            }
        }
        return instance;
    }

    public int getNextPatientId() {
        return patientIdCounter.incrementAndGet();
    }

    public int getNextDoctorId() {
        return doctorIdCounter.incrementAndGet();
    }

    public int getNextAppointmentId() {
        return appointmentIdCounter.incrementAndGet();
    }

    public int getNextBillId() {
        return billIdCounter.incrementAndGet();
    }

    public void reset() {
        patientIdCounter.set(1000);
        doctorIdCounter.set(2000);
        appointmentIdCounter.set(3000);
        billIdCounter.set(4000);
    }
}

