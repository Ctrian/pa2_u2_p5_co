package com.uce.edu.service;

import java.util.List;

import com.uce.edu.repository.modelo.Administrador;
import com.uce.edu.repository.modelo.Asistente;

public interface IAdministradorService {

	public void guardar(Administrador administrador);

	// Typed
	public Administrador buscarPorCedula(String cedula);

	public List<Administrador> buscarPorCargo(String cargo);

	// Native
	public Administrador buscarPorCedulaNat(String cedula);

	public Administrador buscarPorDireccion(String direccion);

	// CAQ

	public Administrador buscarPorNombreCAQ(String nombre);

	public Administrador buscarPorCedulaCAQ(String cedula);

	public Administrador buscarPorCargoCAQ(String cargo);

	public Administrador buscarPorCriteria(String apellido, String direccion, String cedula);

	public Asistente buscarPorAreaCargo(String area_cargo);
}
