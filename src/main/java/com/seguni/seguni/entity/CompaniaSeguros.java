package com.seguni.seguni.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name= "COMPANIASEGUROS")
@SequenceGenerator(name = "sec_compania.nextval", sequenceName = "sec_compania", initialValue = 1, allocationSize = 1)
public class CompaniaSeguros implements Serializable{

	private static final long serialVersionUID = 356892038849501945L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator= "sec_compania.nextval") 
	@Column(name = "ID")
	private int id;
	
	@Column(name = "NUMEROPOLIZA")
	private int numeroPoliza;
		
	@Column(name = "NOMBRECOMPANIA")
	private String nombreCompania;
	
	
	public CompaniaSeguros() {
	
	}
	public CompaniaSeguros(int id, int numeroPoliza, String nombreCompania) {
		super();
		this.id = id;
		this.numeroPoliza = numeroPoliza;
		this.nombreCompania = nombreCompania;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroPoliza() {
		return numeroPoliza;
	}

	public void setNumeroPoliza(int numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}

	public String getNombreCompania() {
		return nombreCompania;
	}

	public void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
	}
	
	

}
