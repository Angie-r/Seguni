package com.seguni.seguni.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "SINIESTRO")
@SequenceGenerator(name = "sec_siniestro.nextval", sequenceName = "sec_siniestro", initialValue = 1, allocationSize = 1)
public class Siniestro implements Serializable{

	private static final long serialVersionUID = -6670702700656597661L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_siniestro.nextval")
	@Column(name = "IDSINIESTRO")
	private int idSiniestro;
	
	@Column(name = "FECHASINIESTRO")
	private Date fechaSiniestro;
	
	@Column(name = "CAUSAS")
	private String causas;
	
	@Column(name = "ACEPTADO")
	private String aceptado;
	
	@Column(name = "INDEMNIZACION")
	private int indemnizacion;
	
	@Column(name = "NUMEROPOLIZA")
	private int numeroPoliza;
	
	@ManyToOne
	@JoinColumn(name = "DNIPERITO")
	Perito perito;
	
	public Perito getPerito() {
		return perito;
	}

	public void setPerito(Perito perito) {
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


	

}
