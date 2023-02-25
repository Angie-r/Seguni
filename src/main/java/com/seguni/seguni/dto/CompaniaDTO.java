package com.seguni.seguni.dto;

import java.io.Serializable;

import java.util.Set;

import com.seguni.seguni.entity.Seguro;



public class CompaniaDTO implements Serializable{

	private static final long serialVersionUID = 8057521235977315949L;
	
	private String nombreCompania;
	private String claseVia;
	private String nombreVia;
	private int numeroVia;
	private int codigoPostal;
	private int telefonoContratacion;
	private int telefonoSiniestro;
	private String notas;
	private Set<Seguro> seguro;
	
	
	
	public CompaniaDTO() {
		super();
	}
	public CompaniaDTO(String nombreCompania, String claseVia, String nombreVia, int numeroVia, int codigoPostal,
			int telefonoContratacion, int telefonoSiniestro, String notas ){
		super();
		this.nombreCompania = nombreCompania;
		this.claseVia = claseVia;
		this.nombreVia = nombreVia;
		this.numeroVia = numeroVia;
		this.codigoPostal = codigoPostal;
		this.telefonoContratacion = telefonoContratacion;
		this.telefonoSiniestro = telefonoSiniestro;
		this.notas = notas;
		
	}
	
	public Set<Seguro> getSeguro() {
		return seguro;
	}
	public void setSeguro(Set<Seguro> seguro) {
		this.seguro = seguro;
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
	public int getTelefonoSiniestro() {
		return telefonoSiniestro;
	}
	public void setTelefonoSiniestro(int telefonoSiniestro) {
		this.telefonoSiniestro = telefonoSiniestro;
	}
	public String getNotas() {
		return notas;
	}
	public void setNotas(String notas) {
		this.notas = notas;
	}
	
	
	

}
