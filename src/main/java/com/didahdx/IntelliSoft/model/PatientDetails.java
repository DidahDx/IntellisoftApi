package com.didahdx.IntelliSoft.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import static javax.persistence.GenerationType.SEQUENCE;

@Table(name="patient_details",
        uniqueConstraints = {
                @UniqueConstraint(name = "patient_number_id_unique", columnNames = "patient_number_id")
        })
@Entity(name="PatientDetails")
public class PatientDetails {
//    @NotNull(message = "{patient_number.notnull}")
//    @Min(value = 0)
    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(
            name = "patient_details_sequence",
            sequenceName = "patient_details_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "patient_details_sequence"
    )
    private Long id;

    @NotNull
    @Column(name = "patient_number_id", nullable = false)
    private  Integer patientNumberId;

    @NotBlank(message = "{first_name.notnull}")
    @NotNull(message = "{first_name.notnull}")
    @Column(name = "first_name", nullable = false)
    private  String firstName;

    @NotBlank(message = "{last_name.notnull}")
    @NotNull(message = "{last_name.notnull}")
    @Column(name="last_name", nullable = false)
    private  String lastName;
    @NotNull(message = "{gender.notnull}")
    @NotBlank(message = "{gender.notnull}")
    @Column(name = "gender", nullable = false)
    private  String gender;
    @NotNull(message = "{registration_date.notnull}")
    @Column(name="registration_date", nullable = false )
    private  Date registrationDate;
    @NotNull(message = "{date_of_birth.notnull}")
    @Column(name = "date_of_birth",nullable = false)
    private  Date dateOfBirth;

    @Transient //used to make variable not included in the table
    private Integer age;

    public PatientDetails(){}

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

    public void setPatientNumberId(Integer patientNumberId) {
        this.patientNumberId = patientNumberId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setDateOfBirth(Date dateOfBirth) {
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

    public Integer getAge() {
        return Period.between(this.dateOfBirth.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate(), LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}