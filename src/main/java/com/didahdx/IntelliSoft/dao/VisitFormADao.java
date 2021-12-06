package com.didahdx.IntelliSoft.dao;

import com.didahdx.IntelliSoft.model.VisitFormA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitFormADao extends JpaRepository<VisitFormA,Long> {

}
