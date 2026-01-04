# MediTrack - Clinic Appointment Management System

A comprehensive Java-based clinic appointment management system designed to streamline medical appointment scheduling, patient management, and clinic operations.

## 🔍 Overview

MediTrack is a robust appointment management system built with Java that helps clinics and healthcare facilities efficiently manage patient appointments, doctor schedules, and medical records. The system provides a user-friendly interface for both healthcare providers and patients to interact with clinic services seamlessly.

## ✨ Features

### Patient Management
- Patient registration and profile management
- View and update personal medical information
- Track appointment history
- Manage medical records securely

### Appointment Scheduling
- Book appointments with available doctors
- View appointment schedules
- Reschedule or cancel appointments
- Real-time availability checking
- Appointment reminders and notifications

### Doctor Management
- Manage doctor profiles and specializations
- Set availability schedules
- View upcoming appointments
- Access patient medical histories
- Treatment documentation

### Administrative Features
- User authentication and authorization
- Role-based access control (Admin, Doctor, Patient)
- Comprehensive reporting and analytics
- System configuration management
- Data backup and recovery

## 🛠 Technology Stack

- **Language**: Java
- **Build Tool**: Maven
- **Database**: SQLite (meditrack.db)
- **Framework**: Java Core Libraries
- **Architecture**: Object-Oriented Programming (OOP)

## 📦 Prerequisites

Before running this application, ensure you have the following installed:

- Java Development Kit (JDK) 11 or higher
- Apache Maven 3.6 or higher
- Git (for cloning the repository)
- SQLite (embedded database)

## 🚀 Installation

### 1. Clone the Repository

```bash
git clone https://github.com/AkshayMadan098/Java-Assignment--Akshay-Madan-MediTrack-Clinic-Appointment-Management-System.git
cd Java-Assignment--Akshay-Madan-MediTrack-Clinic-Appointment-Management-System
```

### 2. Build the Project

```bash
mvn clean install
```

### 3. Run the Application

Using Maven:
```bash
mvn exec:java
```

Or using the provided shell script:
```bash
chmod +x run.sh
./run.sh
```

## 💻 Usage

### Starting the Application

1. Launch the application using one of the methods mentioned above
2. The system will initialize the database on first run
3. Default admin credentials will be created (check console output)

### User Roles and Access

**Admin**
- Full system access
- Manage doctors and patients
- View all appointments and reports
- System configuration

**Doctor**
- View and manage own schedule
- Access assigned patient records
- Document treatments and prescriptions
- Manage appointment confirmations

**Patient**
- Register and manage profile
- Book appointments
- View medical history
- Manage appointments

### Basic Workflows

**Booking an Appointment**
1. Log in as a patient
2. Navigate to "Book Appointment"
3. Select doctor and preferred date/time
4. Confirm booking
5. Receive confirmation notification

**Managing Doctor Schedule**
1. Log in as a doctor
2. Access "My Schedule"
3. Set available time slots
4. View upcoming appointments
5. Update availability as needed

## 📁 Project Structure

```
Java-Assignment--Akshay-Madan-MediTrack-Clinic-Appointment-Management-System/
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── airtribe/
│                   └── meditrack/
│                       ├── models/           # Entity classes
│                       ├── dao/              # Data Access Objects
│                       ├── services/         # Business logic
│                       ├── controllers/      # Application controllers
│                       ├── utils/            # Utility classes
│                       └── Main.java         # Application entry point
│
├── target/                  # Compiled classes and build artifacts
├── meditrack.db            # SQLite database file
├── pom.xml                 # Maven configuration
├── run.sh                  # Shell script to run the application
└── README.md               # This file
```

## 🗄 Database Schema

The application uses SQLite database with the following main tables:

### Users
- user_id (Primary Key)
- username
- password (hashed)
- email
- role (Admin/Doctor/Patient)
- created_at

### Patients
- patient_id (Primary Key)
- user_id (Foreign Key)
- first_name
- last_name
- date_of_birth
- phone_number
- address
- medical_history

### Doctors
- doctor_id (Primary Key)
- user_id (Foreign Key)
- first_name
- last_name
- specialization
- qualification
- phone_number
- availability_schedule

### Appointments
- appointment_id (Primary Key)
- patient_id (Foreign Key)
- doctor_id (Foreign Key)
- appointment_date
- appointment_time
- status (Scheduled/Completed/Cancelled)
- notes
- created_at

### Medical Records
- record_id (Primary Key)
- patient_id (Foreign Key)
- doctor_id (Foreign Key)
- appointment_id (Foreign Key)
- diagnosis
- prescription
- treatment_notes
- record_date

