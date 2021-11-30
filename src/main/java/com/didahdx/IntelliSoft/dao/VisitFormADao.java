package com.didahdx.IntelliSoft.dao;

import com.didahdx.IntelliSoft.model.VisitFormA;

import java.util.List;

public interface VisitFormADao {
    int insert(VisitFormA visitFormA);

    int updateById(int patientNumber, VisitFormA visitFormA);

    int deleteById(int patientNumber, VisitFormA visitFormA);

    List<VisitFormA> getVisitFormA();
}
