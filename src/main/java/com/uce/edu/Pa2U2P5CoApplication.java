package com.uce.edu;

import java.util.List;

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

		Administrador administrador1 = new Administrador();
		administrador1.setNombre("Ctrian");
		administrador1.setApellido("Oli");
		administrador1.setCedula("1750");
		administrador1.setArea_cargo("Ventas");
		administrador1.setDireccion("Guamani");

		this.administradorService.guardar(administrador1);

		Administrador administrador2 = new Administrador();
		administrador2.setNombre("Daniel");
		administrador2.setApellido("Vega");
		administrador2.setCedula("1725");
		administrador2.setArea_cargo("Ventas");
		administrador2.setDireccion("Caupicho");

		this.administradorService.guardar(administrador2);

		Asistente asistente = new Asistente();
		asistente.setNombre("George");
		asistente.setApellido("Luca");
		asistente.setCedula("1720");
		asistente.setDireccion("Condado");
		asistente.setHobbie("Bailar");

		this.asistenteService.guardar(asistente);

		// Typed
		System.out.println("5 con Typed: ");
		List<Administrador> lista = this.administradorService.buscarPorCargo("Ventas");
		for (Administrador administrador : lista) {
			System.out.println(administrador);
		}

		administrador1 = this.administradorService.buscarPorCedula("1750");
		System.out.println(administrador1);

		asistente = this.asistenteService.buscarPorCedula("1720");
		System.out.println(asistente);

		asistente = this.asistenteService.buscarPorNombre("George");
		System.out.println(asistente);

		asistente = this.asistenteService.buscarPorHobie("Bailar");
		System.out.println(asistente);

		// Native
		System.out.println("5 con Native: ");
		administrador1 = this.administradorService.buscarPorCedulaNat("1750");
		System.out.println(administrador1);

		administrador1 = this.administradorService.buscarPorDireccion("Guamani");
		System.out.println(administrador1);

		asistente = this.asistenteService.buscarPorCedulaNat("1720");
		System.out.println(asistente);

		asistente = this.asistenteService.buscarPorDireccionNat("Condado");
		System.out.println(asistente);

		asistente = this.asistenteService.buscarPorHobieNat("Bailar");
		System.out.println(asistente);
	}

}
