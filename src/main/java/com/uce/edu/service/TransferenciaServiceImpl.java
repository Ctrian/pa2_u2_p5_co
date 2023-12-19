package com.uce.edu.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.edu.repository.ITransferenciaRepository;
import com.uce.edu.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {

	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;

	private BigDecimal aux = new BigDecimal("0");

	@Override
	public Transferencia buscar(BigDecimal numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(BigDecimal numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void realizar(String numeroOrigen, String numeroDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal nroFcat(BigDecimal bigDecimal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transferencia> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
