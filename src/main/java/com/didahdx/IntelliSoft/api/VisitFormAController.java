package com.didahdx.IntelliSoft.api;

import com.didahdx.IntelliSoft.service.VisitFormAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("api/v1/visit_form_a")
public class VisitFormAController {
    private final VisitFormAService visitFormAService;

    @Autowired
    public VisitFormAController(VisitFormAService visitFormAService) {
        this.visitFormAService = visitFormAService;
    }


}
