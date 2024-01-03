package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.ITransferenciaRepository;
import com.uce.edu.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {

	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;

	@Override
	public Transferencia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iTransferenciaRepository.seleccionar(id);
	}

	@Override
	public void guardar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.iTransferenciaRepository.insertar(transferencia);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.iTransferenciaRepository.actualizar(transferencia);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iTransferenciaRepository.eliminar(id);
	}
	
}
