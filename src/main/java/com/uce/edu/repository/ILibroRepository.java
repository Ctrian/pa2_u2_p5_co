package com.uce.edu.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.repository.modelo.Libro2;

public interface ILibroRepository {
	// CRUD
	public Libro seleccionar(Integer id);

	public void insertar(Libro libro);

	public void actualizar(Libro libro);

	public void eliminar(Integer id);

	//
	public void insertar(Libro2 libro2);

	// Query
	public Libro seleccionarPorTitulo(String titulo);

	public List<Libro> seleccionarPorFechaPublicacion(LocalDateTime fechaPublicacion);

	// typed
	public Libro seleccionarPorNombre(String nombre);

	public List<Libro> seleccionarPorFecha(LocalDateTime fechaPublicacion);

	// named
	public Libro seleccionarPorNombreNamed(String nombre);

	public List<Libro> seleccionarPorFechaNamed(LocalDateTime fechaPublicacion);

}
