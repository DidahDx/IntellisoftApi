package com.didahdx.IntelliSoft.dao;

import com.didahdx.IntelliSoft.model.PatientDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface PatientDetailDao extends JpaRepository<PatientDetails,Long> {

    @Query("SELECT pd FROM PatientDetails pd WHERE pd.patientNumberId = ?1")
    Optional<PatientDetails> findPatientDetailsByPatientNumberId(Integer patientNumberId);

    @Query("SELECT pd FROM PatientDetails pd WHERE pd.firstName = ?1")
    Optional<PatientDetails> findPatientDetailsByFirstName(String firstName);
}