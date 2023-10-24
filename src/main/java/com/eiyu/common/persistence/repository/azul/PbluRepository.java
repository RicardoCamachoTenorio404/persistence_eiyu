package com.eiyu.common.persistence.repository.azul;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eiyu.common.persistence.entity.azul.Pblu;

@Repository
public interface PbluRepository extends JpaRepository<Pblu,Integer>{

    
}
