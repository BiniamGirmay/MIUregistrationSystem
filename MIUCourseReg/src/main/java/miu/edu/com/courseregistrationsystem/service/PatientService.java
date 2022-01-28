package miu.edu.com.courseregistrationsystem.service;


import miu.edu.com.courseregistrationsystem.domain.Course;
import miu.edu.com.courseregistrationsystem.domain.Patient;


import java.util.List;

public interface PatientService {
    Patient save(Patient patient);
   // Course save(Course course);
    List<Patient> getAllPatient();

}
