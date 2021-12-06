package com.didahdx.IntelliSoft.service;

import com.didahdx.IntelliSoft.dao.VisitFormADao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitFormAService {
    private final VisitFormADao visitFormADao;

    @Autowired
    public VisitFormAService(VisitFormADao visitFormADao) {
        this.visitFormADao = visitFormADao;
    }


}
