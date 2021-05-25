package com.examen.itdappweb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITD_PROVEEDOR")
public class Proveedor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer nif;
	
	@Column(name = "NOMBRE", length=25)
	private String nombre;
	
	@Column(name = "DIRECCION", length=50)
	private String direccion;

	public Integer getNif() {
		return nif;
	}

	public void setNif(Integer nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}