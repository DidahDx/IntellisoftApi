package com.didahdx.IntelliSoft.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.Date;

public class PatientVitals {
    private final int patientNumberId;
    @NonNull
    private final Date visitDate;
    private final double height;
    private final double weight;
    private final double bmi;

    public PatientVitals(@JsonProperty("patient_number") int patientNumberId,
                         @NonNull @JsonProperty("visit_date") Date visitDate, @JsonProperty("height") double height,
                         @JsonProperty("weight") double weight, @JsonProperty("bmi") double bmi) {
        this.patientNumberId = patientNumberId;
        this.visitDate = visitDate;
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;
    }

    public int getPatientNumberId() {
        return patientNumberId;
    }

    @NonNull
    public Date getVisitDate() {
        return visitDate;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getBmi() {
        return bmi;
    }
}
