package com.uce.edu.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.repository.modelo.Libro2;

public interface ILibroService {
	// CRUD
	public Libro buscar(Integer id);

	public Libro buscarPorTitulo(String titulo);

	public void guardar(Libro libro);

	public void guardar(Libro2 libro2);

	public void actualizar(Libro libro);

	public void eliminar(Integer id);

	public List<Libro> buscarPorFecha(LocalDateTime fecha);

	// Typed
	public Libro buscarPorNombre(String nombre);

	public List<Libro> buscarPorFechaPubli(LocalDateTime fechaPublicacion);
	
	
	public Libro buscarPorNombreNamed(String nombre);
	
	public List<Libro> buscarPorFechaNamed(LocalDateTime fecha);
}
