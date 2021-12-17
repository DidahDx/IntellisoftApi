package com.didahdx.IntelliSoft.api;

import com.didahdx.IntelliSoft.apierror.EntityNotFoundException;
import com.didahdx.IntelliSoft.model.PatientDetails;
import com.didahdx.IntelliSoft.service.PatientDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("api/v1/patient_detail") //used to set the path to this rest controller
@RestController //used to handle rest api request
@Validated
public class PatientDetailController {
    private final PatientDetailService patientDetailService;

    @Autowired
    public PatientDetailController(PatientDetailService patientDetailService) {
        this.patientDetailService = patientDetailService;
    }

    @PostMapping
    public PatientDetails addPatientDetail(@Valid @NonNull @RequestBody PatientDetails patientDetails)  throws EntityNotFoundException {
       return patientDetailService.addPatientDetail(patientDetails);
    }

    @GetMapping
    public List<PatientDetails> getPatientDetails()  throws EntityNotFoundException  {
        return patientDetailService.getPatientDetailsList();
    }

    @DeleteMapping(path = "{patientNumber}")
    public void deletePatient(@PathVariable("patientNumber") Integer patientId){
        patientDetailService.deletePatientDetail(patientId);
    }

    @PutMapping(path = "{patientNumber}")
    public void updatePatientDetails(
            @PathVariable("patientNumber") Integer patientId,
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName,
            @RequestParam(required = false) String gender
    ){
        patientDetailService.updatePatientDetail(patientId,firstName,lastName,gender);
    }
}
