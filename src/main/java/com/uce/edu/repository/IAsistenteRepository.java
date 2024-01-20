package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Asistente;

public interface IAsistenteRepository {

	public void insertar(Asistente asistente);

	// Typed
	public Asistente seleccionarPorCedula(String cedula);

	public Asistente seleccionarPorNombre(String nombre);

	public Asistente seleccionarPorHobie(String hobbie);

	// Native
	public Asistente seleccionarPorCedulaNat(String cedula);

	public Asistente seleccionarPorDireccionNat(String direccion);

	public Asistente seleccionarPorHobieNat(String hobbie);
}
