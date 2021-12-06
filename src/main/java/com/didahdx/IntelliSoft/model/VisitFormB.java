package com.didahdx.IntelliSoft.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "VisitFormB")
@Table(name = "visit_form_b",
        uniqueConstraints = {
                @UniqueConstraint(name = "patient_number_id_unique", columnNames = "patient_number_id")
        }
)
public class VisitFormB {
    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(
            name = "visit_form_b_sequence",
            sequenceName = "visit_form_b_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "visit_form_b_sequence"
    )
    private Long id;

    @NotNull
    @Column(name = "patient_number_id", nullable = false)
    private final int patientNumberId;
    @NotNull
    @Column(name = "patient_name", nullable = false)
    private final String patientName;
    @NotNull
    @Column(name = "visit_date", nullable = false)
    private final Date visitDate;
    @NotNull
    @Column(name = "general_health", nullable = false)
    private final String generalHealth;
    @NotNull
    @Column(name = "is_on_any_drugs", nullable = false)
    private final boolean isOnAnyDrugs;
    @NotNull
    @Column(name = "comments", nullable = false)
    private final String comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VisitFormB(@JsonProperty("patient_number") int patientNumber, @JsonProperty("patient_name") String patientName,
                      @JsonProperty("visit_date") Date visitDate,
                      @JsonProperty("general_health") String generalHealth,
                      @JsonProperty("is_on_any_drug") boolean isOnAnyDrugs, @JsonProperty("comments") String comments) {
        this.patientNumberId = patientNumber;
        this.patientName = patientName;
        this.visitDate = visitDate;
        this.generalHealth = generalHealth;
        this.isOnAnyDrugs = isOnAnyDrugs;
        this.comments = comments;
    }

    public int getPatientNumberId() {
        return patientNumberId;
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
