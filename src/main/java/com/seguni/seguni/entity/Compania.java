package com.seguni.seguni.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "COMPANIA")
public class Compania implements Serializable {

	private static final long serialVersionUID = -3563141481015090064L;
	
	@Id
	@Column(name = "NOMBRECOMPANIA")
	private String nombreCompania;
	
	@Column(name = "CLASEVIA")
	private String claseVia;
	
	@Column(name = "NOMBREVIA")
	private String nombreVia;
	
	@Column(name = "NUMEROVIA")
	private int numeroVia;
	
	@Column(name = "CODIGOPOSTAL")
	private int codigoPostal;
	
	@Column(name = "TELEFONOCONTRATACION")
	private int telefonoContratacion;
	
	@Column(name = "TELEFONOSINIESTRO")
	private int telefonoSiniestros;
	
	@Column(name = "NOTAS")
	private String notas;
	
	@ManyToMany(mappedBy = "compania")
	private List<Seguro> seguros;
	

	public List<Seguro> getSeguros() {
		return seguros;
	}

	public void setSeguros(List<Seguro> seguros) {
		this.seguros = seguros;
	}

	public String getNombreCompania() {
		return nombreCompania;
	}

	public void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
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

	public int getTelefonoContratacion() {
		return telefonoContratacion;
	}

	public void setTelefonoContratacion(int telefonoContratacion) {
		this.telefonoContratacion = telefonoContratacion;
	}

	public int getTelefonoSiniestros() {
		return telefonoSiniestros;
	}

	public void setTelefonoSiniestros(int telefonoSiniestros) {
		this.telefonoSiniestros = telefonoSiniestros;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}
	
	
}
