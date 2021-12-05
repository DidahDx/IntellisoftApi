package com.didahdx.IntelliSoft.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class PatientDetails {
    @NotNull(message = "{patient_number.notnull}")
    @Min(value = 0)
    private final Integer patientNumberId;

    @NotBlank(message = "{first_name.notnull}")
    @NotNull(message = "{first_name.notnull}")
    private final String firstName;

    @NotBlank(message = "{last_name.notnull}")
    @NotNull(message = "{last_name.notnull}")
    private final String lastName;
    @NotNull(message = "{gender.notnull}")
    @NotBlank(message = "{gender.notnull}")
    private final String gender;
    @NotNull(message = "{registration_date.notnull}")
    private final Date registrationDate;
    @NotNull(message = "{date_of_birth.notnull}")
    private final Date dateOfBirth;

    public PatientDetails(@JsonProperty("patient_number") Integer patientNumberId, @JsonProperty("first_name") String firstName,
                          @JsonProperty("last_name") String lastName, @JsonProperty("gender") String gender,
                          @JsonProperty("registration_date") Date registrationDate,
                          @JsonProperty("date_of_birth") Date dateOfBirth) {
        this.patientNumberId = patientNumberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.registrationDate = registrationDate;
        this.dateOfBirth = dateOfBirth;
    }


    public Integer getPatientNumberId() {
        return patientNumberId;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getGender() {
        return gender;
    }


    public Date getRegistrationDate() {
        return registrationDate;
    }


    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}