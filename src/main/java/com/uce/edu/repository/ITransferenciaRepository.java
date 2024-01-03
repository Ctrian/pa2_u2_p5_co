package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Transferencia;

public interface ITransferenciaRepository {
	// CRUD
	public Transferencia seleccionar(Integer id);

	public void insertar(Transferencia transferencia);

	public void actualizar(Transferencia transferencia);

	public void eliminar(Integer id);
}
