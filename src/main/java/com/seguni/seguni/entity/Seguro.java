package com.seguni.seguni.entity;

import java.io.Serializable;

import java.sql.Date;

import java.util.HashSet;

import java.util.Objects;
import java.util.Set;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
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
	private Date fechaInicio;
	
	@Column(name = "FECHAVENCIMIENTO")
	private Date fechaVencimiento;
	
	@Column(name = "CONDICIONESPARTICULARES")
	private String condicionesParticulares;
	
	@Column(name = "OBSERVACIONES")
	private String observaciones;
	
	@OneToOne
	@JoinColumn(name = "DNICLI")
	Cliente cliente;
	
	@ManyToMany()
	
	@JoinTable(
			name = "COMPANIASEGUROS",
			joinColumns = @JoinColumn(name = "NUMEROPOLIZA", nullable = false),
			inverseJoinColumns = @JoinColumn(name = "NOMBRECOMPANIA", nullable = false))
	private Set<Compania> compania = new HashSet<>();
	
	public void addCompania(Compania compania) {
		this.compania.add(compania);
		compania.getNombreCompania();
	
	}
	
	public void removeCompania(String nombreCompania) {
		Compania compani = this.compania.stream().filter(c -> Objects.equals(c.getNombreCompania(), nombreCompania)).findFirst().orElse(null);
		if (compani != null) {
			this.compania.remove(compani);
			((Compania) compania).getNombreCompania();	
			}
	}
	
	public Seguro() {
	}
	

	public Seguro(int numeroPoliza, int ramo, Date fechaInicio, Date fechaVencimiento, String condicionesParticulares,
			String observaciones, Cliente cliente, Set<Compania> compania) {
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
