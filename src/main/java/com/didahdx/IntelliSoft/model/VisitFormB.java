package com.didahdx.IntelliSoft.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.Date;

public class VisitFormB {
    private final int patientNumber;
    @NonNull
    private final String patientName;
    @NonNull
    private final Date visitDate;
    @NonNull
    private final String generalHealth;
    private final boolean isOnAnyDrugs;
    @NonNull
    private final String comments;

    public VisitFormB(@JsonProperty("patient_number") int patientNumber, @JsonProperty("patient_name") String patientName,
                      @JsonProperty("visit_date") Date visitDate,
                      @JsonProperty("general_health") String generalHealth,
                      @JsonProperty("is_on_any_drug") boolean isOnAnyDrugs, @JsonProperty("comments") String comments) {
        this.patientNumber = patientNumber;
        this.patientName = patientName;
        this.visitDate = visitDate;
        this.generalHealth = generalHealth;
        this.isOnAnyDrugs = isOnAnyDrugs;
        this.comments = comments;
    }

    public int getPatientNumber() {
        return patientNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public String getGeneralHealth() {
        return generalHealth;
    }

    public boolean isOnAnyDrugs() {
        return isOnAnyDrugs;
    }

    public String getComments() {
        return comments;
    }
}
