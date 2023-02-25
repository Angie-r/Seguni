package com.seguni.seguni.repository;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.seguni.seguni.entity.Seguro;

@Repository("seguroRepository")
public interface SeguroRepository extends JpaRepository<Seguro, Serializable>{
	
	public List<Seguro> findByFechaVencimientoAfter(Date fechaVencimiento);
	
	public List<Seguro> findByNumeroPolizaOrderByRamoAsc(Long numeroPoliza);
}
