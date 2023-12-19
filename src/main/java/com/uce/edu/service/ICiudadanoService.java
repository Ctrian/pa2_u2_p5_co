package com.uce.edu.service;

import com.uce.edu.repository.modelo.Ciudadano;

public interface ICiudadanoService {
	// CRUD
	public Ciudadano buscar(Integer id);
	
	public void guardar(Ciudadano ciudadano);
}
