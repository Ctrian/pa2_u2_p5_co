package com.uce.edu.service;

import java.util.List;

import com.uce.edu.repository.modelo.Administrador;

public interface IAdministradorService {

	public void guardar(Administrador administrador);

	// Typed
	public Administrador buscarPorCedula(String cedula);

	public List<Administrador> buscarPorCargo(String cargo);

	// Native
	public Administrador buscarPorCedulaNat(String cedula);

	public Administrador buscarPorDireccion(String direccion);
}
