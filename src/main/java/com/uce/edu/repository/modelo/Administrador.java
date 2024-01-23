package com.uce.edu.repository.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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

	@Column(name = "admin_cedula")
	private String cedula;

	@Column(name = "admin_direccion")
	private String direccion;

	@Column(name = "admin_area_cargo")
	private String area_cargo;

	@OneToMany(mappedBy = "administrador", cascade = CascadeType.ALL)
	private List<Asistente> asistentes;

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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public List<Asistente> getAsistentes() {
		return asistentes;
	}

	public void setAsistentes(List<Asistente> asistentes) {
		this.asistentes = asistentes;
	}

	@Override
	public String toString() {
		return "Administrador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", direccion=" + direccion + ", area_cargo=" + area_cargo + "]";
	}

}
