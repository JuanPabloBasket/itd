package com.examen.itdappweb.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "ITD_CLIENTE")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer dni;

	@Column(name = "NOMBRE", length=25)
	private String nombre;

	@Column(name = "APELLIDO", length=25)
	private String apellido;

	@Column(name = "DIRECCION", length=50)
	private String direccion;

	@Column(name = "FECHANAC")
	@Temporal(TemporalType.DATE)
	private Date fechaNac;

	@ManyToMany
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	List<Producto> productos;

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
}