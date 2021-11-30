package com.didahdx.IntelliSoft.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.Date;

public class PatientDetails {
    private final int patientNumberId;
    @NonNull
    private final String firstName;
    @NonNull
    private final String lastName;
    @NonNull
    private final String gender;
    @NonNull
    private final Date registrationDate;
    @NonNull
    private final Date dateOfBirth;

    public PatientDetails(@JsonProperty("patient_number") int patientNumberId, @NonNull @JsonProperty("first_name") String firstName,
                          @NonNull @JsonProperty("last_name") String lastName, @NonNull @JsonProperty("gender") String gender,
                          @NonNull @JsonProperty("registration_date") Date registrationDate,
                          @NonNull @JsonProperty("date_of_birth") Date dateOfBirth) {
        this.patientNumberId = patientNumberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.registrationDate = registrationDate;
        this.dateOfBirth = dateOfBirth;
    }

    public int getPatientNumberId() {
        return patientNumberId;
    }

    @NonNull
    public String getFirstName() {
        return firstName;
    }

    @NonNull
    public String getLastName() {
        return lastName;
    }

    @NonNull
    public String getGender() {
        return gender;
    }

    @NonNull
    public Date getRegistrationDate() {
        return registrationDate;
    }

    @NonNull
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}