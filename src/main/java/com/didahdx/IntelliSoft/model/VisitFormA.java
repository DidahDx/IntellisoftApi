package com.didahdx.IntelliSoft.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "VisitFormA")
@Table(name = "visit_form_a")
public class VisitFormA {
    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(
            name = "visit_form_a_sequence",
            sequenceName = "visit_form_a_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "visit_form_a_sequence"
    )
    private Long id;

    @NotNull
    @Column(name = "patient_number_id", nullable = false)
    private int patientNumberId;

    @NotNull
    @Column(name = "patient_name", nullable = false)
    private String patientName;

    @NotNull
    @Column(name = "visit_date", nullable = false)
    private Date visitDate;

    @NotNull
    @Column(name = "general_health", nullable = false)
    private String generalHealth;

    @NotNull
    @Column(name = "has_been_on_diet", nullable = false)
    private boolean hasBeenOnDiet;

    @NotNull
    @Column(name = "comments", nullable = false)
    private String comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VisitFormA(@JsonProperty("patient_number") int patientNumber, @JsonProperty("patient_name") String patientName,
                      @JsonProperty("visit_date") Date visitDate,
                      @JsonProperty("general_health") String generalHealth,
                      @JsonProperty("has_been_on_diet") boolean hasBeenOnDiet, @JsonProperty("comments") String comments) {
        this.patientNumberId = patientNumber;
        this.patientName = patientName;
        this.visitDate = visitDate;
        this.generalHealth = generalHealth;
        this.hasBeenOnDiet = hasBeenOnDiet;
        this.comments = comments;
    }

    public VisitFormA(){
    }

    public void setPatientNumberId(int patientNumberId) {
        this.patientNumberId = patientNumberId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setGeneralHealth(String generalHealth) {
        this.generalHealth = generalHealth;
    }

    public void setHasBeenOnDiet(boolean hasBeenOnDiet) {
        this.hasBeenOnDiet = hasBeenOnDiet;
    }

    public void setComments(String comments) {
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

    public int getPatientNumberId() {
        return patientNumberId;
    }
}
