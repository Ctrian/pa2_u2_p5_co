package com.uce.edu.repository;

import java.util.List;

import com.uce.edu.repository.modelo.Administrador;
import com.uce.edu.repository.modelo.Asistente;

public interface IAdministradorRepository {

	public void insertar(Administrador administrador);

	// Typed
	public Administrador seleccionarPorCedula(String cedula);

	public List<Administrador> seleccionarPorCargo(String cargo);

	// Native
	public Administrador seleccionarPorCedulaNat(String cedula);

	public Administrador seleccionarPorDireccion(String direccion);

	// CAQ
	public Administrador seleccionarPorNombreCAQ(String nombre);

	public Administrador seleccionarPorCedulaCAQ(String cedula);

	public Administrador seleccionarPorCargoCAQ(String cargo);

	// Funcionalidad que busque por direccion
	// Cuando el Administrador sea de Guamani, lo busque por cedula
	// Cuando el Administrador sea de Calderon, lo busca por apellido
	public Administrador seleccionarPorCriteria(String apellido, String direccion, String cedula);

	public Asistente seleccionarPorAreaCargo(String area_cargo);
}
