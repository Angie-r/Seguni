package com.seguni.seguni.dto;

import java.io.Serializable;
import java.util.Date;


import java.util.Set;

import com.seguni.seguni.entity.Cliente;
import com.seguni.seguni.entity.Compania;

public class SeguroDTO implements Serializable{

	private static final long serialVersionUID = 6535974174862580909L;
	
	private int numeroPoliza;
	private int ramo;
	private Date fechaInicio;
	private Date fechaVencimiento;
	private String condicionesParticulares;
	private String observaciones;
	private Set<Compania> compania;
	private Cliente cliente;
	
	
	public SeguroDTO() {
		super();
	}
	public SeguroDTO(int numeroPoliza, int ramo, Date fechaInicio, Date fechaVencimiento,
			String condicionesParticulares, String observaciones, Cliente cliente, Set<Compania> compania) {
		super();
		this.numeroPoliza = numeroPoliza;
		this.ramo = ramo;
		this.fechaInicio = fechaInicio;
		this.fechaVencimiento = fechaVencimiento;
		this.condicionesParticulares = condicionesParticulares;
		this.observaciones = observaciones;
		this.cliente = cliente;
		this.compania = compania;
	}
	
	
	public Set<Compania> getCompania() {
		return compania;
	}
	public void setCompania(Set<Compania> compania) {
		this.compania = compania;
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
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	

}
