package com.seguni.seguni.dto;

import java.io.Serializable;
import java.util.Date;

import com.seguni.seguni.entity.Perito;

public class SiniestroDTO implements Serializable{

	private static final long serialVersionUID = 8946494314396842598L;
	
	private int idSiniestro;
	private Date fechaSiniestro;
	private String causas;
	private String aceptado;
	private int indemnizacion;
	private int numeroPoliza;
	private Perito perito;
	
	
	public SiniestroDTO() {
		super();
	}

	public SiniestroDTO(int idSiniestro, Date fechaSiniestro, String causas, String aceptado, int indemnizacion,
			int numeroPoliza, Perito perito) {
		super();
		this.idSiniestro = idSiniestro;
		this.fechaSiniestro = fechaSiniestro;
		this.causas = causas;
		this.aceptado = aceptado;
		this.indemnizacion = indemnizacion;
		this.numeroPoliza = numeroPoliza;
		this.perito = perito;
	}

	public int getIdSiniestro() {
		return idSiniestro;
	}

	public void setIdSiniestro(int idSiniestro) {
		this.idSiniestro = idSiniestro;
	}

	public Date getFechaSiniestro() {
		return fechaSiniestro;
	}

	public void setFechaSiniestro(Date fechaSiniestro) {
		this.fechaSiniestro = fechaSiniestro;
	}

	public String getCausas() {
		return causas;
	}

	public void setCausas(String causas) {
		this.causas = causas;
	}

	public String getAceptado() {
		return aceptado;
	}

	public void setAceptado(String aceptado) {
		this.aceptado = aceptado;
	}

	public int getIndemnizacion() {
		return indemnizacion;
	}

	public void setIndemnizacion(int indemnizacion) {
		this.indemnizacion = indemnizacion;
	}

	public int getNumeroPoliza() {
		return numeroPoliza;
	}

	public void setNumeroPoliza(int numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}

	public Perito getPerito() {
		return perito;
	}

	public void setPerito(Perito perito) {
		this.perito = perito;
	}
		
	
	

}
