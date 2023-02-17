package com.seguni.seguni.dto;

import java.io.Serializable;

public class ClienteDTO implements Serializable{

	private static final long serialVersionUID = 4655540764996850406L;
	
	private int dniCl;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String claseVia;
	private String nombreVia;
	private int numeroVia;
	private int codigoPostal;
	private String ciudad;
	private int telefono;
	private String observaciones;
	
	
	
	public ClienteDTO(int dniCl, String nombre, String primerApellido, String segundoApellido, String claseVia,
			String nombreVia, int numeroVia, int codigoPostal, String ciudad, int telefono, String observaciones) {
		super();
		this.dniCl = dniCl;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.claseVia = claseVia;
		this.nombreVia = nombreVia;
		this.numeroVia = numeroVia;
		this.codigoPostal = codigoPostal;
		this.ciudad = ciudad;
		this.telefono = telefono;
		this.observaciones = observaciones;
	}
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
