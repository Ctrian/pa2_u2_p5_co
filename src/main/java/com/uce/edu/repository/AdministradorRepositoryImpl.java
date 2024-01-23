package com.uce.edu.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Administrador;
import com.uce.edu.repository.modelo.Asistente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
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

	@Override
	public Administrador seleccionarPorNombreCAQ(String nombre) {
		// TODO Auto-generated method stub
		CriteriaBuilder mCB = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Administrador> mCQ = mCB.createQuery(Administrador.class);
		Root<Administrador> myFrom = mCQ.from(Administrador.class);
		Predicate condicionNombre = mCB.equal(myFrom.get("nombre"), nombre);
		mCQ.select(myFrom).where(condicionNombre);
		TypedQuery<Administrador> myTypedQuery = this.entityManager.createQuery(mCQ);
		return myTypedQuery.getResultList().get(0);
	}

	@Override
	public Administrador seleccionarPorCedulaCAQ(String cedula) {
		// TODO Auto-generated method stub
		CriteriaBuilder mCB = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Administrador> mCQ = mCB.createQuery(Administrador.class);
		Root<Administrador> myFrom = mCQ.from(Administrador.class);
		Predicate condicionNombre = mCB.equal(myFrom.get("cedula"), cedula);
		mCQ.select(myFrom).where(condicionNombre);
		TypedQuery<Administrador> myTypedQuery = this.entityManager.createQuery(mCQ);
		return myTypedQuery.getResultList().get(0);
	}

	@Override
	public Administrador seleccionarPorCargoCAQ(String cargo) {
		// TODO Auto-generated method stub
		CriteriaBuilder mCB = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Administrador> mCQ = mCB.createQuery(Administrador.class);
		Root<Administrador> myFrom = mCQ.from(Administrador.class);
		Predicate condicionNombre = mCB.equal(myFrom.get("area_cargo"), cargo);
		mCQ.select(myFrom).where(condicionNombre);
		TypedQuery<Administrador> myTypedQuery = this.entityManager.createQuery(mCQ);
		return myTypedQuery.getResultList().get(0);
	}

	@Override
	public Administrador seleccionarPorCriteria(String apellido, String direccion, String cedula) {
		// TODO Auto-generated method stub
		CriteriaBuilder mCB = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Administrador> mCQ = mCB.createQuery(Administrador.class);
		Root<Administrador> myFrom = mCQ.from(Administrador.class);

		Predicate condicionGenerica = null;

		if (!direccion.equals("Guamani")) {
			condicionGenerica = mCB.equal(myFrom.get("apellido"), apellido);
		} else {
			condicionGenerica = mCB.equal(myFrom.get("cedula"), cedula);
		}

		mCQ.select(myFrom).where(condicionGenerica);

		TypedQuery<Administrador> myTypedQuery = this.entityManager.createQuery(mCQ);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Asistente seleccionarPorAreaCargo(String area_cargo) {
		// TODO Auto-generated method stub
		CriteriaBuilder mCB = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Asistente> mCQ = mCB.createQuery(Asistente.class);
		Root<Asistente> myFrom = mCQ.from(Asistente.class);

		Predicate condicionAreaCargo = mCB.equal(myFrom.get("administrador").get("area_cargo"), area_cargo);

		mCQ.select(myFrom).where(condicionAreaCargo);
		TypedQuery<Asistente> myTypedQuery = this.entityManager.createQuery(mCQ);
		return myTypedQuery.getResultList().get(0);
	}

}
