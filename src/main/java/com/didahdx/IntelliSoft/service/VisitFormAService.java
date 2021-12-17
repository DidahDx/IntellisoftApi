package com.didahdx.IntelliSoft.service;

import com.didahdx.IntelliSoft.dao.VisitFormADao;
import com.didahdx.IntelliSoft.model.VisitFormA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitFormAService {
    private final VisitFormADao visitFormADao;

    @Autowired
    public VisitFormAService(VisitFormADao visitFormADao) {
        this.visitFormADao = visitFormADao;
    }

    public VisitFormA addVisitFromADetails(VisitFormA visitFormA){
        return visitFormADao.save(visitFormA);
    }

    public List<VisitFormA> getAllVisitFormADetails(){
        return  visitFormADao.findAll();
    }

}
