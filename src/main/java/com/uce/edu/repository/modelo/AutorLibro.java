package com.uce.edu.repository.modelo;

import java.time.LocalDateTime;

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
@Table(name = "autor2_libro2")
public class AutorLibro {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_autor_libro")
	@SequenceGenerator(name = "seq_autor_libro", sequenceName = "seq_autor_libro", allocationSize = 1)

	@Column(name = "auli_id")
	private Integer id;

	@ManyToOne(cascade = CascadeType.ALL)
	// aquí tengo la tabla de rompimiento;
	@JoinColumn(name = "auli_id_autor")
	private Autor2 autor2;

	@ManyToOne
	@JoinColumn(name = "auli_id_libro")
	private Libro2 libro2;
	
	@Column(name = "auli_fecha")
	private LocalDateTime fecha;

	//get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Autor2 getAutor2() {
		return autor2;
	}

	public void setAutor2(Autor2 autor2) {
		this.autor2 = autor2;
	}

	public Libro2 getLibro2() {
		return libro2;
	}

	public void setLibro2(Libro2 libro2) {
		this.libro2 = libro2;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "AutorLibro [id=" + id + ", autor2=" + autor2 + ", libro2=" + libro2 + ", fecha=" + fecha + "]";
	}
	
}
