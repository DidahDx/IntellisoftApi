package com.didahdx.IntelliSoft.service;

import com.didahdx.IntelliSoft.dao.PatientDetailDao;
import com.didahdx.IntelliSoft.model.PatientDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientDetailService {
    private final PatientDetailDao patientDetailDao;

    @Autowired
    public PatientDetailService(@Qualifier("postgres") PatientDetailDao patientDetailDao) {
        this.patientDetailDao = patientDetailDao;
    }

    public int addPatientDetail(PatientDetails patientDetails){
        return patientDetailDao.insert(patientDetails);
    }

    public int updatePatientDetail(PatientDetails patientDetails){
        return patientDetailDao.updateById(patientDetails.getPatientNumberId(),patientDetails);
    }

    public int deletePatientDetail(int patientNumberId){
        return patientDetailDao.deleteById(patientNumberId);
    }

    public List<PatientDetails> getPatientDetailsList(){
        return patientDetailDao.getPatientDetails();
    }
}