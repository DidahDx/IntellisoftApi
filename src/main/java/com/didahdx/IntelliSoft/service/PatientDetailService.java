package com.didahdx.IntelliSoft.service;

import com.didahdx.IntelliSoft.apierror.EntityNotFoundException;
import com.didahdx.IntelliSoft.dao.PatientDetailDao;
import com.didahdx.IntelliSoft.model.PatientDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PatientDetailService {
    private final PatientDetailDao patientDetailDao;

    @Autowired
    public PatientDetailService(PatientDetailDao patientDetailDao) {
        this.patientDetailDao = patientDetailDao;
    }

    public PatientDetails addPatientDetail(PatientDetails patientDetails) {
        Optional<PatientDetails> patientDetailsOptional = patientDetailDao
                .findPatientDetailsByPatientNumberId(patientDetails.getPatientNumberId());

        if (patientDetailsOptional.isPresent()) {
            throw new EntityNotFoundException(PatientDetails.class, String.valueOf(patientDetails.getPatientNumberId()), "Patient number already exist");
//      throw new RuntimeException(String.format("Patient number already exist %d",patientDetails.getPatientNumberId()));
        }
        return patientDetailDao.save(patientDetails);
    }

    public PatientDetails updatePatientDetail(PatientDetails patientDetails) {
        return patientDetailDao.saveAndFlush(patientDetails);
    }

    public void deletePatientDetail(Integer patientNumberId) {
        Optional<PatientDetails> patientDetailsOptional = patientDetailDao
                .findPatientDetailsByPatientNumberId(patientNumberId);
        if (patientDetailsOptional.isEmpty()) {
            throw new EntityNotFoundException(PatientDetails.class, String.valueOf(patientNumberId), "Patient number does not exist");
        }
        patientDetailDao.deleteById(patientDetailsOptional.get().getId());
    }

    public List<PatientDetails> getPatientDetailsList() {
        return patientDetailDao.findAll();
    }

//    @Transactional lookup usage
    public void updatePatientDetail(Integer patientId, String firstName, String lastName, String gender) {
        Optional<PatientDetails> patientDetailsOptional = patientDetailDao
                .findPatientDetailsByPatientNumberId(patientId);
        if (patientDetailsOptional.isEmpty()) {
            throw new EntityNotFoundException(PatientDetails.class, String.valueOf(patientId), "Patient number does not exist");
        }

        PatientDetails patientDetails = patientDetailsOptional.get();

        if (firstName != null && firstName.length() > 0 &&
                !Objects.equals(patientDetails.getFirstName(), firstName)) {
            patientDetails.setFirstName(firstName);
        }

        if (lastName != null && lastName.length() > 0 &&
                !Objects.equals(patientDetails.getLastName(), lastName)) {
            patientDetails.setLastName(lastName);
        }

        if (gender != null && gender.length() > 0 &&
                !Objects.equals(patientDetails.getGender(), gender)) {
            patientDetails.setGender(gender);
        }

        patientDetailDao.saveAndFlush(patientDetails);
    }
}