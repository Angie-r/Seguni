package com.seguni.seguni.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
	private List<Compania> compania;
	private Cliente cliente;
	
	
	public SeguroDTO() {
		super();
	}
	public SeguroDTO(int numeroPoliza, int ramo, Date fechaInicio, Date fechaVencimiento,
			String condicionesParticulares, String observaciones, List<Compania> compania, Cliente cliente) {
		super();
		this.numeroPoliza = numeroPoliza;
		this.ramo = ramo;
		this.fechaInicio = fechaInicio;
		this.fechaVencimiento = fechaVencimiento;
		this.condicionesParticulares = condicionesParticulares;
		this.observaciones = observaciones;
		this.compania = compania;
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
	
	
	
	

}
