package com.didahdx.IntelliSoft.service;

import com.didahdx.IntelliSoft.dao.PatientVitalsDao;
import com.didahdx.IntelliSoft.model.PatientVitals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientVitalsService {
    private final PatientVitalsDao patientVitalsDao;

    @Autowired
    public PatientVitalsService(PatientVitalsDao patientVitalsDao) {
        this.patientVitalsDao = patientVitalsDao;
    }

    public PatientVitals addPatientVitals(PatientVitals patientVitals){
        return patientVitalsDao.save(patientVitals);
    }

    public PatientVitals updatePatientVitals(PatientVitals patientVitals){
        return patientVitalsDao.saveAndFlush(patientVitals);
    }

    public List<PatientVitals> getPatientVitalsById(int patientNumberId){
        return patientVitalsDao.findAll() ;
    }

    public List<PatientVitals> getPatientVitals() {
        return patientVitalsDao.findAll();
    }
}
