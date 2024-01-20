package com.uce.edu.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Administrador;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AdministradorRepositoryImpl implements IAdministradorRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Administrador administrador) {
		// TODO Auto-generated method stub
		this.entityManager.persist(administrador);
	}

	// Typed
	@Override
	public Administrador seleccionarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Administrador> mQ = this.entityManager
				.createQuery("SELECT a FROM Administrador a WHERE a.cedula =:cedula", Administrador.class);
		mQ.setParameter("cedula", cedula);
		return mQ.getResultList().get(0);
	}

	@Override
	public List<Administrador> seleccionarPorCargo(String cargo) {
		// TODO Auto-generated method stub
		TypedQuery<Administrador> mQ = this.entityManager
				.createQuery("SELECT a FROM Administrador a WHERE a.area_cargo =:cargo", Administrador.class);
		mQ.setParameter("cargo", cargo);
		return (List<Administrador>) mQ.getResultList();
	}

	// Native
	@Override
	public Administrador seleccionarPorCedulaNat(String cedula) {
		// TODO Auto-generated method stub
		Query mQ = this.entityManager.createNativeQuery("SELECT * FROM administrador a WHERE a.admin_cedula =:cedula",
				Administrador.class);
		mQ.setParameter("cedula", cedula);
		return (Administrador) mQ.getResultList().get(0);
	}

	@Override
	public Administrador seleccionarPorDireccion(String direccion) {
		// TODO Auto-generated method stub
		Query mQ = this.entityManager.createNativeQuery(
				"SELECT * FROM administrador a WHERE a.admin_direccion =:direccion", Administrador.class);
		mQ.setParameter("direccion", direccion);
		return (Administrador) mQ.getResultList().get(0);
	}

}
