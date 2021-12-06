package com.didahdx.IntelliSoft.service;

import com.didahdx.IntelliSoft.dao.VisitFormBDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitFormBService {
    private final VisitFormBDao visitFormBDao;

    @Autowired
    public VisitFormBService(VisitFormBDao visitFormBDao) {
        this.visitFormBDao = visitFormBDao;
    }

}
