package com.uce.edu.service;

import com.uce.edu.repository.modelo.Transferencia;

public interface ITransferenciaService {
	// CRUD
	public Transferencia buscar(Integer id);

	public void guardar(Transferencia transferencia);

	public void actualizar(Transferencia transferencia);

	public void eliminar(Integer id);
}
