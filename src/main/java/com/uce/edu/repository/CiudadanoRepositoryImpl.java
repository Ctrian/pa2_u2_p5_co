package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Ciudadano;
import com.uce.edu.repository.modelo.Empleado;

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
public class CiudadanoRepositoryImpl implements ICiudadanoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Ciudadano seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Ciudadano.class, id);
	}

	@Override
	public void insertar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.entityManager.persist(ciudadano);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.entityManager.merge(ciudadano);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Ciudadano ciudadano = this.seleccionar(id);
		this.entityManager.remove(ciudadano);
	}

	@Override
	public Empleado seleccionarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Empleado> mQ = this.entityManager
				.createQuery("SELECT e FROM Empleado e WHERE e.ciudadano.cedula =:cedula", Empleado.class);
		mQ.setParameter("cedula", cedula);
		return mQ.getResultList().get(0);
	}

	@Override
	public Ciudadano seleccionarPorCedulaCiu(String cedula) {
		// TODO Auto-generated method stub
		Query mQ = this.entityManager.createNativeQuery("SELECT * FROM ciudadano c WHERE c.ciud_cedula =:cedula",
				Ciudadano.class);
		mQ.setParameter("cedula", cedula);
		return (Ciudadano) mQ.getResultList().get(0);
	}

	@Override
	public Ciudadano seleccionarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		// JPQL: SELECT c FROM Ciudadano c WHERE c.apellido = : variable
		// 0. Creamos una instancia de la interfaz CriteriaBuilder a partir de un
		// EntityManager

		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		// 1. Determinamos el tipo de retorno que va a tener mi consulta

		CriteriaQuery<Ciudadano> myCriteriaQuery = myCriteriaBuilder.createQuery(Ciudadano.class);
		// 2. Construir nuestro SQL
		// 2.1 Determinar el FROM, lo utilizaremos a traves de una interfaz conocida
		// como (Root)
		// Nota: No necesariamente el from es igual al tipo de retorno
		Root<Ciudadano> myFrom = myCriteriaQuery.from(Ciudadano.class); // "FROM Ciudadano"
		// 2.2 Construir las condiciones (WHERE) del SQL
		// En criteria API Query las condiciones se las conoce como "Predicate"
		// c.apellido = : variable
		Predicate condicionApellido = myCriteriaBuilder.equal(myFrom.get("apellido"), apellido);

		// 3. Construir el SQL final
		myCriteriaQuery.select(myFrom).where(condicionApellido);

		// 4. Ejecutamos la consulta con un typedQuery
		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);
		return myTypedQuery.getResultList().get(0);
	}

	@Override
	public Ciudadano seleccionarPorCriteria(String nombre, String apellido, String cedula) {
		// TODO Auto-generated method stub
		CriteriaBuilder mCB = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Ciudadano> mCQ = mCB.createQuery(Ciudadano.class);
		Root<Ciudadano> myFrom = mCQ.from(Ciudadano.class);

		Predicate condicionGenerica = null;

		if (cedula.startsWith("17")) {
			condicionGenerica = mCB.equal(myFrom.get("nombre"), nombre);
		} else if (cedula.startsWith("05")) {
			condicionGenerica = mCB.equal(myFrom.get("apellido"), apellido);
		} else {
			condicionGenerica = mCB.equal(myFrom.get("cedula"), cedula);
		}

		mCQ.select(myFrom).where(condicionGenerica);

		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(mCQ);
		return myTypedQuery.getResultList().get(0);
	}

	@Override
	public Ciudadano seleccionarPorCriteriaAndOr(String nombre, String apellido, String cedula) {
		// TODO Auto-generated method stub
		CriteriaBuilder mCB = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Ciudadano> mCQ = mCB.createQuery(Ciudadano.class);
		Root<Ciudadano> myFrom = mCQ.from(Ciudadano.class);

		Predicate condicionTotal = null;

		//c.nombre = : nombre
		Predicate condicionNombre = mCB.equal(myFrom.get("nombre"), nombre);

		//c.apellido = : apellido
		Predicate condicionApellido = mCB.equal(myFrom.get("apellido"), apellido);

		if (cedula.startsWith("17")) {
			condicionTotal = mCB.or(condicionNombre, condicionApellido);
		} else if (cedula.startsWith("05")) {
			condicionTotal = mCB.and(condicionNombre, condicionApellido);
		}

		mCQ.select(myFrom).where(condicionTotal);

		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(mCQ);
		return myTypedQuery.getResultList().get(0);
	}
}
