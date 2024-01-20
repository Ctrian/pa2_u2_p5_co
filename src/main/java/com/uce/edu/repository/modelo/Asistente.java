package com.uce.edu.repository.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "asistente")
public class Asistente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_asistente")
	@SequenceGenerator(name = "seq_asistente", sequenceName = "seq_asistente", allocationSize = 1)

	@Column(name = "asist_id")
	private Integer id;

	@Column(name = "asist_cedula")
	private String cedula;

	@Column(name = "asist_nombre")
	private String nombre;

	@Column(name = "asist_apellido")
	private String apellido;

	@Column(name = "asist_direccion")
	private String direccion;

	@Column(name = "asist_hobbie")
	private String hobbie;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "asist_id_admin")
	private Administrador administrador;

	// metodos get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public String getHobbie() {
		return hobbie;
	}

	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

}
