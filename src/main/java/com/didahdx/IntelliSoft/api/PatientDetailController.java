package com.didahdx.IntelliSoft.api;

import com.didahdx.IntelliSoft.apierror.EntityNotFoundException;
import com.didahdx.IntelliSoft.model.PatientDetails;
import com.didahdx.IntelliSoft.service.PatientDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public int addPatientDetail(@Valid @NonNull @RequestBody PatientDetails patientDetails)  throws EntityNotFoundException {
       return patientDetailService.addPatientDetail(patientDetails);
    }

    @GetMapping
    public List<PatientDetails> getPatientDetails()  throws EntityNotFoundException  {
        return patientDetailService.getPatientDetailsList();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }
}
