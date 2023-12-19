package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Empleado;

public interface IEmpleadoRepository {
	// CRUD
	public Empleado seleccionar(Integer id);
	
	public void insertar(Empleado empleado);
}
