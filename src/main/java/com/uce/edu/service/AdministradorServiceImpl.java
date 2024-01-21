package com.uce.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IAdministradorRepository;
import com.uce.edu.repository.modelo.Administrador;

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

}
