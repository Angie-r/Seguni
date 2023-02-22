package com.seguni.seguni.entity;

import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable {

	private static final long serialVersionUID = -6582205562828240245L;
	
	@Id
	@Column(name = "DNICL",insertable = false, updatable = false)
	private int dniCl;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "PRIMERAPELLIDO")
	private String primerApellido;
	
	@Column(name = "SEGUNDOAPELLIDO")
	private String segundoApellido;
	
	@Column(name = "CLASEVIA")
	private String claseVia;
	
	@Column(name = "NOMBREVIA")
	private String nombreVia;
	
	@Column(name = "NUMEROVIA")
	private int numeroVia;
	
	@Column(name = "CODIGOPOSTAL")
	private int codigoPostal;
	
	@Column(name = "CIUDAD")
	private String ciudad;
	
	@Column(name = "TELEFONO")
	private int telefono;
	
	@Column(name = "OBSERVACIONES")
	private String observaciones;
	
	
	public int getDniCl() {
		return dniCl;
	}

	public void setDniCl(int dniCl) {
		this.dniCl = dniCl;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getClaseVia() {
		return claseVia;
	}

	public void setClaseVia(String claseVia) {
		this.claseVia = claseVia;
	}

	public String getNombreVia() {
		return nombreVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public int getNumeroVia() {
		return numeroVia;
	}

	public void setNumeroVia(int numeroVia) {
		this.numeroVia = numeroVia;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	
}
