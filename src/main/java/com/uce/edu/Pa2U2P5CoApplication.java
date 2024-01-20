package com.uce.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Administrador;
import com.uce.edu.repository.modelo.Asistente;
import com.uce.edu.service.IAdministradorService;
import com.uce.edu.service.IAsistenteService;

@SpringBootApplication
public class Pa2U2P5CoApplication implements CommandLineRunner {

	@Autowired
	private IAdministradorService administradorService;

	@Autowired
	private IAsistenteService asistenteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5CoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Administrador administrador = new Administrador();
		administrador.setNombre("Ctrian");
		administrador.setApellido("Oli");
		administrador.setCedula("1750");
		administrador.setArea_cargo("Ventas");
		administrador.setDireccion("Guamani");

		this.administradorService.guardar(administrador);

		Asistente asistente = new Asistente();
		asistente.setNombre("George");
		asistente.setApellido("Luca");
		asistente.setCedula("1720");
		asistente.setDireccion("Condado");
		asistente.setHobbie("Bailar");
		
		this.asistenteService.guardar(asistente);

		// Typed
		this.administradorService.buscarPorCargo("Ventas");

		this.administradorService.buscarPorCedula("1750");

		this.asistenteService.buscarPorCedula("1720");

		this.asistenteService.buscarPorNombre("George");

		this.asistenteService.buscarPorHobie("Bailar");

		// Native
		this.administradorService.buscarPorCedulaNat("1750");

		this.administradorService.buscarPorDireccion("Guamani");

		this.asistenteService.buscarPorCedulaNat("1720");

		this.asistenteService.buscarPorDireccionNat("Condado");

		this.asistenteService.buscarPorHobieNat("Bailar");
	}

}
