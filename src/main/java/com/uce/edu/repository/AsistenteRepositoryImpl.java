package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Asistente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AsistenteRepositoryImpl implements IAsistenteRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Asistente asistente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(asistente);
	}

	@Override
	public Asistente seleccionarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Asistente> mQ = this.entityManager.createQuery("SELECT a FROM Asistente a WHERE a.cedula =:cedula",
				Asistente.class);
		mQ.setParameter("cedula", cedula);
		return mQ.getResultList().get(0);
	}

	@Override
	public Asistente seleccionarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Asistente> mQ = this.entityManager.createQuery("SELECT a FROM Asistente a WHERE a.nombre =:nombre",
				Asistente.class);
		mQ.setParameter("nombre", nombre);
		return mQ.getResultList().get(0);
	}

	@Override
	public Asistente seleccionarPorHobie(String hobbie) {
		// TODO Auto-generated method stub
		TypedQuery<Asistente> mQ = this.entityManager.createQuery("SELECT a FROM Asistente a WHERE a.hobbie =:hobbie",
				Asistente.class);
		mQ.setParameter("hobbie", hobbie);
		return mQ.getResultList().get(0);
	}

	@Override
	public Asistente seleccionarPorCedulaNat(String cedula) {
		// TODO Auto-generated method stub
		Query mQ = this.entityManager.createNativeQuery("SELECT * FROM Asistente a WHERE a.asist_cedula =:cedula",
				Asistente.class);
		mQ.setParameter("cedula", cedula);
		return (Asistente) mQ.getResultList().get(0);
	}

	@Override
	public Asistente seleccionarPorDireccionNat(String direccion) {
		// TODO Auto-generated method stub
		Query mQ = this.entityManager.createNativeQuery("SELECT * FROM Asistente a WHERE a.asist_direccion =:direccion",
				Asistente.class);
		mQ.setParameter("direccion", direccion);
		return (Asistente) mQ.getResultList().get(0);
	}

	@Override
	public Asistente seleccionarPorHobieNat(String hobbie) {
		// TODO Auto-generated method stub
		Query mQ = this.entityManager.createNativeQuery("SELECT * FROM Asistente a WHERE a.asist_hobbie =:hobbie",
				Asistente.class);
		mQ.setParameter("hobbie", hobbie);
		return (Asistente) mQ.getResultList().get(0);
	}

}
