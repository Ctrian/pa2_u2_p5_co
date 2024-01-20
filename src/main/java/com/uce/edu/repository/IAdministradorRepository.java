package com.uce.edu.repository;

import java.util.List;

import com.uce.edu.repository.modelo.Administrador;

public interface IAdministradorRepository {

	public void insertar(Administrador administrador);

	// Typed
	public Administrador seleccionarPorCedula(String cedula);

	public List<Administrador> seleccionarPorCargo(String cargo);

	// Native
	public Administrador seleccionarPorCedulaNat(String cedula);

	public Administrador seleccionarPorDireccion(String direccion);
}
