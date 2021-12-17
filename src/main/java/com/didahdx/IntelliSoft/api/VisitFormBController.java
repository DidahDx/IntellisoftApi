package com.didahdx.IntelliSoft.api;

import com.didahdx.IntelliSoft.model.VisitFormB;
import com.didahdx.IntelliSoft.service.VisitFormBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Validated
@RequestMapping("api/v1/visit_form_b")
public class VisitFormBController {
    private final VisitFormBService visitFormBService;

    @Autowired
    public VisitFormBController(VisitFormBService visitFormBService) {
        this.visitFormBService = visitFormBService;
    }

    @PostMapping
    public VisitFormB addVisitFormBDetails(@Valid @RequestBody VisitFormB visitFormB){
        return visitFormBService.addVisitFromADetails(visitFormB);
    }

    @GetMapping
    public List<VisitFormB> getAllVisitFormBDetails(){
        return visitFormBService.getAllVisitFormADetails();
    }

}