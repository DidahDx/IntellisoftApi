package com.didahdx.IntelliSoft.api;

import com.didahdx.IntelliSoft.apierror.EntityNotFoundException;
import com.didahdx.IntelliSoft.model.VisitFormA;
import com.didahdx.IntelliSoft.service.VisitFormAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
@RequestMapping("api/v1/visit_form_a")
public class VisitFormAController {
    private final VisitFormAService visitFormAService;

    @Autowired
    public VisitFormAController(VisitFormAService visitFormAService) {
        this.visitFormAService = visitFormAService;
    }


    @PostMapping
    public VisitFormA addVisitFormA(@Valid @RequestBody VisitFormA visitFormA) throws EntityNotFoundException {
        return visitFormAService.addVisitFromADetails(visitFormA);
    }

    @GetMapping
    public List<VisitFormA> getAllVisitFormADetails() throws EntityNotFoundException {
        return visitFormAService.getAllVisitFormADetails();
    }

}
