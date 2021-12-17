package com.didahdx.IntelliSoft.service;

import com.didahdx.IntelliSoft.dao.VisitFormBDao;
import com.didahdx.IntelliSoft.model.VisitFormB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitFormBService {
    private final VisitFormBDao visitFormBDao;

    @Autowired
    public VisitFormBService(VisitFormBDao visitFormBDao) {
        this.visitFormBDao = visitFormBDao;
    }


    public VisitFormB addVisitFromADetails(VisitFormB visitFormB) {
        return visitFormBDao.save(visitFormB);
    }

    public List<VisitFormB> getAllVisitFormADetails() {
        return visitFormBDao.findAll();
    }
}
