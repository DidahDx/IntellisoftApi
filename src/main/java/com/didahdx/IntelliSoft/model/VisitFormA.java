package com.didahdx.IntelliSoft.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.Date;

public class VisitFormA {
    private final int patientNumber;
    @NonNull
    private final String patientName;
    @NonNull
    private final Date visitDate;
    @NonNull
    private final String generalHealth;
    private final boolean hasBeenOnDiet;
    @NonNull
    private final String comments;

    public VisitFormA(@JsonProperty("patient_number") int patientNumber, @JsonProperty("patient_name") String patientName,
                      @JsonProperty("visit_date") Date visitDate,
                      @JsonProperty("general_health") String generalHealth,
                      @JsonProperty("has_been_on_diet") boolean hasBeenOnDiet, @JsonProperty("comments") String comments) {
        this.patientNumber = patientNumber;
        this.patientName = patientName;
        this.visitDate = visitDate;
        this.generalHealth = generalHealth;
        this.hasBeenOnDiet = hasBeenOnDiet;
        this.comments = comments;
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

    public boolean isHasBeenOnDiet() {
        return hasBeenOnDiet;
    }

    public String getComments() {
        return comments;
    }

    public int getPatientNumber() {
        return patientNumber;
    }
}
