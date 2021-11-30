package com.didahdx.IntelliSoft.postgresdaoImpl;

import com.didahdx.IntelliSoft.dao.PatientDetailDao;
import com.didahdx.IntelliSoft.model.PatientDetails;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Locale;

@Repository("postgres")
public class PatientDetailDbImpl implements PatientDetailDao {

    private final JdbcTemplate jdbcTemplate;
    private final String TABLE_NAME="patient_detail";

    public PatientDetailDbImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public int insert(PatientDetails patientDetails) {
        String sql = String.format("INSERT INTO %s (%s, %s , %s  , %s ,  %s , %s ) VALUES (?,?,?,?,?,?)",
                TABLE_NAME,
                PatientDetailTable.patient_number_id.name(),
                PatientDetailTable.first_name.name(),
                PatientDetailTable.last_name.name(),
                PatientDetailTable.gender.name(),
                PatientDetailTable.registration_date.name(),
                PatientDetailTable.date_of_birth.name());
        return jdbcTemplate.update(sql,patientDetails.getPatientNumberId(),patientDetails.getFirstName(),
                patientDetails.getLastName(),patientDetails.getGender(),patientDetails.getRegistrationDate(),
                patientDetails.getDateOfBirth());
    }

    @Override
    public int updateById(int patientNumber, PatientDetails patientDetails) {
        return 0;
    }

    @Override
    public int deleteById(int patientNumber) {
        String sql = String.format("DELETE FROM %s WHERE %s = ? ",
                TABLE_NAME,PatientDetailTable.patient_number_id.name());
        return jdbcTemplate.update(sql, patientNumber);
    }

    @Override
    public List<PatientDetails> getPatientDetails() {
        String sql = String.format(Locale.ROOT,"SELECT * FROM %s",TABLE_NAME);
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            int id = rs.getInt(PatientDetailTable.patient_number_id.name());
            String firstName = rs.getString(PatientDetailTable.first_name.name());
            String lastName = rs.getString(PatientDetailTable.last_name.name());
            String gender = rs.getString(PatientDetailTable.gender.name());
            Date registrationDate = rs.getDate(PatientDetailTable.registration_date.name());
            Date dateOfBirth = rs.getDate(PatientDetailTable.date_of_birth.name());
            return new PatientDetails(id, firstName,lastName,gender,registrationDate,dateOfBirth);
        });
    }

    public enum PatientDetailTable {
        patient_number_id,last_name,first_name,gender,registration_date,date_of_birth
    }


}
