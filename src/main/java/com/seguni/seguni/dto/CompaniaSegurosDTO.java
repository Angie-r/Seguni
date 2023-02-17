package com.seguni.seguni.dto;

import java.io.Serializable;

public class CompaniaSegurosDTO implements Serializable{

	private static final long serialVersionUID = -6242039310311905723L;
	
	private int id;
	private int numeroPoliza;
	private String nombreCompania;
	
	
	public CompaniaSegurosDTO() {
		super();
	}
	public CompaniaSegurosDTO(int id, int numeroPoliza, String nombreCompania) {
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
