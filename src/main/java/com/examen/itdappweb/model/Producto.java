package com.examen.itdappweb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "ITD_PRODUCTO")
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;
	
	@Column(name = "NOMBRE", length=25)
	private String nombre;
	
	@Column(name = "PRECIO")
	private Integer precio;
	
	@OneToOne
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	private Proveedor proveedor;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
}