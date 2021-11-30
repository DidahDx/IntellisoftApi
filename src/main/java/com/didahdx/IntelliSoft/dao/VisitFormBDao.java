package com.didahdx.IntelliSoft.dao;

import com.didahdx.IntelliSoft.model.VisitFormB;

import java.util.List;

public interface VisitFormBDao {
    int insert(VisitFormB visitFormB);

    int updateById(int patientNumber, VisitFormB visitFormB);

    int deleteById(int patientNumber, VisitFormB visitFormB);

    List<VisitFormB> getVisitFormB();
}
