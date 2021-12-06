package com.didahdx.IntelliSoft.dao;

import com.didahdx.IntelliSoft.model.PatientVitals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientVitalsDao extends JpaRepository<PatientVitals,Long> {

}
