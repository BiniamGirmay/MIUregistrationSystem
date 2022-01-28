package miu.edu.com.courseregistrationsystem.controller;



import miu.edu.com.courseregistrationsystem.domain.AcademicBlock;
import miu.edu.com.courseregistrationsystem.domain.Course;
import miu.edu.com.courseregistrationsystem.domain.Patient;

import miu.edu.com.courseregistrationsystem.dto.AcademicBlockDto;
import miu.edu.com.courseregistrationsystem.dto.PatientDto;
import miu.edu.com.courseregistrationsystem.service.implementation.PatientServiceImpl;
import miu.edu.com.courseregistrationsystem.util.DateAndCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/patients")
public class PatientController {



    @Autowired
    private PatientServiceImpl patientService;

    @GetMapping("/all")
    public List<Patient> getAllPatients() {
        return patientService.getAllPatient();
    }

    @PostMapping("/create")
    public Patient save(@RequestBody PatientDto patientDto) {
        Patient patient=new Patient();
        patient.setPatientId(patientDto.getPatientId());
        patient.setAge(patientDto.getAge());
        patient.setEmail(patientDto.getEmail());
        patient.setContactPhoneNumber(patientDto.getContactPhoneNumber());
        patient.setFullName(patientDto.getFullName());
        patient.setIsAnOut(patientDto.getIsAnOut());
        return patientService.save(patient);
    }

}
