package com.uce.edu.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "administrador")
public class Administrador {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_administrador")
	@SequenceGenerator(name = "seq_administrador", sequenceName = "seq_administrador", allocationSize = 1)

	@Column(name = "admin_id")
	private Integer id;

	@Column(name = "admin_nombre")
	private String nombre;

	@Column(name = "admin_apellido")
	private String apellido;

	@Column(name = "admin_direccion")
	private String direccion;

	@Column(name = "admin_area_cargo")
	private String area_cargo;

	// metodos get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getArea_cargo() {
		return area_cargo;
	}

	public void setArea_cargo(String area_cargo) {
		this.area_cargo = area_cargo;
	}

}
