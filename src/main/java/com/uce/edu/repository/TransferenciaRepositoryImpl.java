package com.uce.edu.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Transferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Transferencia seleccionar(BigDecimal numero) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Transferencia.class, numero);
	}

	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(transferencia);

	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(transferencia);
	}

	@Override
	public void eliminar(BigDecimal numero) {
		// TODO Auto-generated method stub
		Transferencia transferencia = this.seleccionar(numero);
		this.entityManager.remove(transferencia);
	}

	@Override
	public BigDecimal nroFcat(BigDecimal bigDecimal) {
		BigDecimal aux = BigDecimal.ZERO;
		aux = aux.add(bigDecimal);
		return aux;
	}
//
	@Override
	public List<Transferencia> reporteTransferencia() {
//		// TODO Auto-generated method stub
//		List<Transferencia> lista = base;
//		int indice = 0;
//		for (Transferencia trans : lista) {
//			indice++;
//			System.out.println(indice + ":" + trans);
//		}
		return null;
	}
	
}
