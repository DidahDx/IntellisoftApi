package com.didahdx.IntelliSoft.api;

import com.didahdx.IntelliSoft.model.PatientDetails;
import com.didahdx.IntelliSoft.service.PatientDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/patient_detail") //used to set the path to this rest controller
@RestController //used to handle rest api request
public class PatientDetailController {
    private final PatientDetailService patientDetailService;

    @Autowired
    public PatientDetailController(PatientDetailService patientDetailService) {
        this.patientDetailService = patientDetailService;
    }

    @PostMapping
    public int addPatientDetail(@Validated @NonNull @RequestBody PatientDetails patientDetails){
       return patientDetailService.addPatientDetail(patientDetails);
    }

    @GetMapping
    public List<PatientDetails> getPatientDetails(){
        return patientDetailService.getPatientDetailsList();
    }
}
