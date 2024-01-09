package com.uce.edu.repository.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "autor2")
//Entidad principal, (identifico con - "baja la pk")
public class Autor2 {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_autor2")
	@SequenceGenerator(name = "seq_autor2", sequenceName = "seq_autor2", allocationSize = 1)
	
	@Column(name = "auto_id")
	private Integer id;
	
	@Column(name = "auto_nombre")
	private String nombre;
	
	@Column(name = "auto_nacionalidad")
	private String nacionalidad;
	
	//De la entidad AutorLibro
	@OneToMany(mappedBy = "autor2")
	private List<AutorLibro> autoresLibros;

	//metodos get y set
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

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public List<AutorLibro> getAutoresLibros() {
		return autoresLibros;
	}

	public void setAutoresLibros(List<AutorLibro> autoresLibros) {
		this.autoresLibros = autoresLibros;
	}
	
	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}
	
}
