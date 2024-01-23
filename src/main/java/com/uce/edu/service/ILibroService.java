package com.uce.edu.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.repository.modelo.Libro2;

public interface ILibroService {
	// CRUD
	public Libro buscar(Integer id);

	public void guardar(Libro libro);

	public void actualizar(Libro libro);

	public void eliminar(Integer id);
	
	// 
	public void guardar(Libro2 libro2);
	
	// Query
	public Libro buscarPorTitulo(String titulo);

	public List<Libro> buscarPorFechaPublicacion(LocalDateTime fecha);

	// Typed
	public Libro buscarPorNombre(String nombre);

	public List<Libro> buscarPorFechaPubli(LocalDateTime fechaPublicacion);

	// Named
	public Libro buscarPorNombreNamed(String nombre);

	public List<Libro> buscarPorFechaNamed(LocalDateTime fecha);
}
