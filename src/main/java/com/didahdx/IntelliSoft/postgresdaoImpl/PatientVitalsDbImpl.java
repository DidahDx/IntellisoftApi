package com.didahdx.IntelliSoft.postgresdaoImpl;

import com.didahdx.IntelliSoft.dao.PatientVitalsDao;
import com.didahdx.IntelliSoft.model.PatientVitals;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("postgres_vitals")
public class PatientVitalsDbImpl implements PatientVitalsDao {
    @Override
    public int insert(PatientVitals patientVitals) {
        return 0;
    }

    @Override
    public int updateById(int patientNumber, PatientVitals patientVitals) {
        return 0;
    }

    @Override
    public int deleteById(int patientNumber, PatientVitals patientVitals) {
        return 0;
    }

    @Override
    public List<PatientVitals> getPatientVitals() {
        return null;
    }
}
