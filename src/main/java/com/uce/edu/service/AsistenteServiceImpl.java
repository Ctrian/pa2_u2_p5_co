package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IAsistenteRepository;
import com.uce.edu.repository.modelo.Asistente;

@Service
public class AsistenteServiceImpl implements IAsistenteService {

	@Autowired
	private IAsistenteRepository asistenteRepository;

	@Override
	public void guardar(Asistente asistente) {
		// TODO Auto-generated method stub
		this.asistenteRepository.insertar(asistente);
	}

	@Override
	public Asistente buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.asistenteRepository.seleccionarPorCedula(cedula);
	}

	@Override
	public Asistente buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.asistenteRepository.seleccionarPorNombre(nombre);
	}

	@Override
	public Asistente buscarPorHobie(String hobbie) {
		// TODO Auto-generated method stub
		return this.asistenteRepository.seleccionarPorHobie(hobbie);
	}

	@Override
	public Asistente buscarPorCedulaNat(String cedula) {
		// TODO Auto-generated method stub
		return this.asistenteRepository.seleccionarPorCedulaNat(cedula);
	}

	@Override
	public Asistente buscarPorDireccionNat(String direccion) {
		// TODO Auto-generated method stub
		return this.asistenteRepository.seleccionarPorDireccionNat(direccion);
	}

	@Override
	public Asistente buscarPorHobieNat(String hobbie) {
		// TODO Auto-generated method stub
		return this.asistenteRepository.seleccionarPorHobieNat(hobbie);
	}

}
