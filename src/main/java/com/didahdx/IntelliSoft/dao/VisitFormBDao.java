package com.didahdx.IntelliSoft.dao;

import com.didahdx.IntelliSoft.model.VisitFormB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitFormBDao extends JpaRepository<VisitFormB,Long> {

}
