package com.didahdx.IntelliSoft.postgresdaoImpl;

import com.didahdx.IntelliSoft.dao.VisitFormBDao;
import com.didahdx.IntelliSoft.model.VisitFormB;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("postgres_form_b")
public class VisitFormBDbImpl implements VisitFormBDao {
    @Override
    public int insert(VisitFormB visitFormB) {
        return 0;
    }

    @Override
    public int updateById(int patientNumber, VisitFormB visitFormB) {
        return 0;
    }

    @Override
    public int deleteById(int patientNumber, VisitFormB visitFormB) {
        return 0;
    }

    @Override
    public List<VisitFormB> getVisitFormB() {
        return null;
    }
}
