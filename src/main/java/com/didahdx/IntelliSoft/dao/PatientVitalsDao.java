package com.didahdx.IntelliSoft.dao;

import com.didahdx.IntelliSoft.model.PatientVitals;

import java.util.List;

public interface PatientVitalsDao {
    int insert(PatientVitals patientVitals);

    int updateById(int patientNumber, PatientVitals patientVitals);

    int deleteById(int patientNumber, PatientVitals patientVitals);

    List<PatientVitals> getPatientVitals();
}
