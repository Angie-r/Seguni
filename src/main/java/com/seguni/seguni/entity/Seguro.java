package com.seguni.seguni.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="SEGURO")
@SequenceGenerator(name = "sec_poliza.nextval", sequenceName = "sec_poliza", initialValue = 1, allocationSize = 1)
public class Seguro implements Serializable{

	private static final long serialVersionUID = -77512483651226906L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_poliza.nextval")
	@Column(name = "NUMEROPOLIZA")
	private int numeroPoliza;
	
	@Column(name = "RAMO")
	private int ramo; 
	
	@Column(name = "FECHAINICIO")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date fechaInicio;
	
	@Column(name = "FECHAVENCIMIENTO")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date fechaVencimiento;
	
	@Column(name = "CONDICIONESPARTICULARES")
	private String condicionesParticulares;
	
	@Column(name = "OBSERVACIONES")
	private String observaciones;
	
	
	@ManyToOne
	@JoinColumn(name = "DNICLI")
	Cliente cliente;
	
	@JoinTable(
			name = "COMPANIASEGUROS",
			joinColumns = @JoinColumn(name = "NUMEROPOLIZA", nullable = false),
			inverseJoinColumns = @JoinColumn(name ="NOMBRECOMPANIA", nullable = false))
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Compania> compania;
	
	public void addCompania(Compania compania) {
		if(this.compania == null) {
			this.compania = new ArrayList<>();
		}
		this.compania.add(compania);
	}
	
	
	public List<Compania> getCompania() {
		return compania;
	}


	public void setCompania(List<Compania> compania) {
		this.compania = compania;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNumeroPoliza() {
		return numeroPoliza;
	}

	public void setNumeroPoliza(int numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}

	public int getRamo() {
		return ramo;
	}

	public void setRamo(int ramo) {
		this.ramo = ramo;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getCondicionesParticulares() {
		return condicionesParticulares;
	}

	public void setCondicionesParticulares(String condicionesParticulares) {
		this.condicionesParticulares = condicionesParticulares;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	
	

}
