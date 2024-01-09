package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.repository.modelo.Libro2;

public interface ILibroRepository {
	// CRUD
	public Libro seleccionar(Integer id);

	public Libro seleccionarPorNombre(String nombre);

	public void insertar(Libro libro);

	public void insertar(Libro2 libro2);

	public void actualizar(Libro libro);

	public void eliminar(Integer id);

}
