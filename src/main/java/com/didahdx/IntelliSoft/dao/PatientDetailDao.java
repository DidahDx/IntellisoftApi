package com.didahdx.IntelliSoft.dao;

import com.didahdx.IntelliSoft.model.PatientDetails;

import java.util.List;

public interface PatientDetailDao {

    int insert(PatientDetails patientDetails);

    int updateById(int patientNumber, PatientDetails patientDetails);

    int deleteById(int patientNumber);

    List<PatientDetails> getPatientDetails();

}