package com.uce.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IAdministradorRepository;
import com.uce.edu.repository.modelo.Administrador;
import com.uce.edu.repository.modelo.Asistente;

@Service
public class AdministradorServiceImpl implements IAdministradorService {

	@Autowired
	private IAdministradorRepository administradorRepository;

	@Override
	public void guardar(Administrador administrador) {
		// TODO Auto-generated method stub
		this.administradorRepository.insertar(administrador);
	}

	@Override
	public Administrador buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.administradorRepository.seleccionarPorCedula(cedula);
	}

	@Override
	public List<Administrador> buscarPorCargo(String cargo) {
		// TODO Auto-generated method stub
		return this.administradorRepository.seleccionarPorCargo(cargo);
	}

	@Override
	public Administrador buscarPorCedulaNat(String cedula) {
		// TODO Auto-generated method stub
		return this.administradorRepository.seleccionarPorCedulaNat(cedula);
	}

	@Override
	public Administrador buscarPorDireccion(String direccion) {
		// TODO Auto-generated method stub
		return this.administradorRepository.seleccionarPorDireccion(direccion);
	}

	@Override
	public Administrador buscarPorNombreCAQ(String nombre) {
		// TODO Auto-generated method stub
		return this.administradorRepository.seleccionarPorNombreCAQ(nombre);
	}

	@Override
	public Administrador buscarPorCedulaCAQ(String cedula) {
		// TODO Auto-generated method stub
		return this.administradorRepository.seleccionarPorCedulaCAQ(cedula);
	}

	@Override
	public Administrador buscarPorCargoCAQ(String cargo) {
		// TODO Auto-generated method stub
		return this.administradorRepository.seleccionarPorCargoCAQ(cargo);
	}

	@Override
	public Administrador buscarPorCriteria(String apellido, String direccion, String cedula) {
		// TODO Auto-generated method stub
		return this.administradorRepository.seleccionarPorCriteria(apellido, direccion, cedula);
	}

	@Override
	public Asistente buscarPorAreaCargo(String area_cargo) {
		// TODO Auto-generated method stub
		return this.administradorRepository.seleccionarPorAreaCargo(area_cargo);
	}

}
