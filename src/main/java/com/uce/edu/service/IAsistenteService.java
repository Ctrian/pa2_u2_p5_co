package com.uce.edu.service;

import com.uce.edu.repository.modelo.Asistente;

public interface IAsistenteService {

	public void guardar(Asistente asistente);

	// Typed
	public Asistente buscarPorCedula(String cedula);

	public Asistente buscarPorNombre(String nombre);

	public Asistente buscarPorHobie(String hobbie);

	// Native
	public Asistente buscarPorCedulaNat(String cedula);

	public Asistente buscarPorDireccionNat(String direccion);

	public Asistente buscarPorHobieNat(String hobbie);
}
