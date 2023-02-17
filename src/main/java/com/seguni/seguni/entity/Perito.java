package com.seguni.seguni.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PERITO")
public class Perito implements Serializable{

	private static final long serialVersionUID = 3414759951545723574L;
	
	@Id
	@Column(name = "DNIPERITO")
	private int dniPerito;
	
	@Column(name = "NOMBREPERITO")
	private String nombrePerito;
	
	@Column(name = "APELLIDOPERITO1")
	private String apellidoPerito1;
	
	@Column(name = "APELLIDOPERITO2")
	private String apellidoPerito2;
	
	@Column(name = "TELEFONOCONTACTO")
	private int telefonoContacto;
	
	@Column (name = "TELEFONOOFICINA")
	private int telefonoOficina;
	
	@Column (name = "CLASEVIA")
	private String claseVia;
	
	@Column (name = "NOMBREVIA")
	private String nombreVia;
	
	@Column (name = "NUMEROVIA")
	private int numeroVia;
	
	@Column (name = "CODIGOPOSTAL")
	private int codigoPostal;
	
	@Column (name = "CIUDAD")
	private String ciudad;

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
