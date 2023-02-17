package com.seguni.seguni.dto;

import java.io.Serializable;

public class PeritoDTO implements Serializable{

	private static final long serialVersionUID = 4373129560125570791L;
	
	private int dniPerito;
	private String nombrePerito;
	private String apellidoPerito1;
	private String apellidoPerito2;
	private int telefonoContacto;
	private int telefonoOficina;
	private String claseVia;
	private String nombreVia;
	private int numeroVia;
	private int codigoPostal;
	private String ciudad;
	
	
	public PeritoDTO() {
		super();
	}

	public PeritoDTO(int dniPerito, String nombrePerito, String apellidoPerito1, String apellidoPerito2,
			int telefonoContacto, int telefonoOficina, String claseVia, String nombreVia, int numeroVia,
			int codigoPostal, String ciudad) {
		super();
		this.dniPerito = dniPerito;
		this.nombrePerito = nombrePerito;
		this.apellidoPerito1 = apellidoPerito1;
		this.apellidoPerito2 = apellidoPerito2;
		this.telefonoContacto = telefonoContacto;
		this.telefonoOficina = telefonoOficina;
		this.claseVia = claseVia;
		this.nombreVia = nombreVia;
		this.numeroVia = numeroVia;
		this.codigoPostal = codigoPostal;
		this.ciudad = ciudad;
	}


	public int getDniPerito() {
		return dniPerito;
	}



	public void setDniPerito(int dniPerito) {
		this.dniPerito = dniPerito;
	}



	public String getNombrePerito() {
		return nombrePerito;
	}



	public void setNombrePerito(String nombrePerito) {
		this.nombrePerito = nombrePerito;
	}



	public String getApellidoPerito1() {
		return apellidoPerito1;
	}



	public void setApellidoPerito1(String apellidoPerito1) {
		this.apellidoPerito1 = apellidoPerito1;
	}



	public String getApellidoPerito2() {
		return apellidoPerito2;
	}



	public void setApellidoPerito2(String apellidoPerito2) {
		this.apellidoPerito2 = apellidoPerito2;
	}



	public int getTelefonoContacto() {
		return telefonoContacto;
	}



	public void setTelefonoContacto(int telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}



	public int getTelefonoOficina() {
		return telefonoOficina;
	}



	public void setTelefonoOficina(int telefonoOficina) {
		this.telefonoOficina = telefonoOficina;
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
	
	
}
