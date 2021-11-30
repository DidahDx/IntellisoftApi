package com.didahdx.IntelliSoft.postgresdaoImpl;

import com.didahdx.IntelliSoft.dao.VisitFormADao;
import com.didahdx.IntelliSoft.model.VisitFormA;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("postgres_form_a")
public class VisitFormADbImpl implements VisitFormADao {
    @Override
    public int insert(VisitFormA visitFormA) {
        return 0;
    }

    @Override
    public int updateById(int patientNumber, VisitFormA visitFormA) {
        return 0;
    }

    @Override
    public int deleteById(int patientNumber, VisitFormA visitFormA) {
        return 0;
    }

    @Override
    public List<VisitFormA> getVisitFormA() {
        return null;
    }
}
