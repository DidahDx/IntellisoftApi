package com.didahdx.IntelliSoft.api;

import com.didahdx.IntelliSoft.apierror.EntityNotFoundException;
import com.didahdx.IntelliSoft.model.PatientVitals;
import com.didahdx.IntelliSoft.service.PatientVitalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
@RequestMapping("api/v1/patient_vitals")
public class PatientVitalsController {

    private final PatientVitalsService patientVitalsService;

    @Autowired
    public PatientVitalsController(PatientVitalsService patientVitalsService) {
        this.patientVitalsService = patientVitalsService;
    }

    @PostMapping
    public PatientVitals addPatientVital(@Valid @RequestBody PatientVitals patientVitals) throws EntityNotFoundException {
       return patientVitalsService.addPatientVitals(patientVitals);
    }

    @PostMapping(path = "{patient_number_id}")
    public PatientVitals addPatientVital(@Valid @PathVariable("patient_number_id") Integer patientNumberId,
                                @Valid @RequestBody PatientVitals patientVitals) throws EntityNotFoundException{
       return patientVitalsService.updatePatientVitals(patientVitals);
    }

    @GetMapping
    public List<PatientVitals> getPatientVitals() throws EntityNotFoundException {
        return patientVitalsService.getPatientVitals();
    }

}
