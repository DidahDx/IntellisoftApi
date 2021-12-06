package com.didahdx.IntelliSoft.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import springfox.documentation.annotations.ApiIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "PatientVitals")
@Table(name = "patient_vitals"
//        uniqueConstraints = {
//                @UniqueConstraint(name = "patient_number_id_unique", columnNames = "patient_number_id")
//        }
)
public class PatientVitals {
    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(
            name = "patient_vital_sequence",
            sequenceName = "patient_vital_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "patient_vital_sequence"
    )
    private  Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    @Column(name = "patient_number_id", nullable = false)
    private  Long patientNumberId;
    @NotNull
    @Column(name = "visit_date", nullable = false)
    private  Date visitDate;
    @NotNull
    @Column(name = "height", nullable = false)
    private  Double height;
    @NotNull
    @Column(name = "weight", nullable = false)
    private  Double weight;
    @NotNull
    @Column(name = "bmi", nullable = false)
    private Double bmi;


    public PatientVitals(@JsonProperty("patient_number") Long patientNumberId,
                      @JsonProperty("visit_date") Date visitDate, @JsonProperty("height") double height,
                         @JsonProperty("weight") double weight, @JsonProperty("bmi") double bmi) {
        this.patientNumberId = patientNumberId;
        this.visitDate = visitDate;
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;
    }

    public PatientVitals(){
    }

    public void setPatientNumberId(Long patientNumberId) {
        this.patientNumberId = patientNumberId;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setBmi(Double bmi) {
        this.bmi = bmi;
    }

    public Long getPatientNumberId() {
        return patientNumberId;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getBmi() {
        return bmi;
    }
}
