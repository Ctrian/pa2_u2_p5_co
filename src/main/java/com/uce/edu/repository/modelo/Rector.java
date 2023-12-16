package com.uce.edu.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "rector")
public class Rector {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_rector")
	@SequenceGenerator(name = "seq_rector", sequenceName = "seq_rector", allocationSize = 1)
	
	@Column(name = "rect_id")
	private Integer id;

	@Column(name = "rect_nombre")
	private String nombre;

	@Column(name = "rect_apellido")
	private String apellido;

	@Column(name = "rect_direccion")
	private String direccion;

	@Column(name = "rect_no_horas")
	private String no_horas;

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

	public String getNo_horas() {
		return no_horas;
	}

	public void setNo_horas(String no_horas) {
		this.no_horas = no_horas;
	}

}
