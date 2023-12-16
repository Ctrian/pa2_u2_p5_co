package com.uce.edu.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "inspector")
public class Inspector {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_inspector")
	@SequenceGenerator(name = "seq_inspector", sequenceName = "seq_inspector", allocationSize = 1)

	@Column(name = "insp_id")
	private Integer id;

	@Column(name = "insp_nombre")
	private String nombre;

	@Column(name = "insp_apellido")
	private String apellido;

	@Column(name = "insp_area_cargo")
	private String area_cargo;

	@Column(name = "insp_no_horas")
	private Integer no_horas;

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

	public String getArea_cargo() {
		return area_cargo;
	}

	public void setArea_cargo(String area_cargo) {
		this.area_cargo = area_cargo;
	}

	public Integer getNo_horas() {
		return no_horas;
	}

	public void setNo_horas(Integer no_horas) {
		this.no_horas = no_horas;
	}

}
