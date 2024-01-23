package com.uce.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Administrador;
import com.uce.edu.repository.modelo.Asistente;
import com.uce.edu.service.IAdministradorService;

@SpringBootApplication
public class Pa2U2P5CoApplication implements CommandLineRunner {

	@Autowired
	private IAdministradorService administradorService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5CoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Administrador administrador0 = this.administradorService.buscarPorNombreCAQ("Ctrian");
		System.out.println(administrador0);

		Administrador administrador1 = this.administradorService.buscarPorCedulaCAQ("1725");
		System.out.println(administrador1);

		Administrador administrador2 = this.administradorService.buscarPorCargoCAQ("Ventas");
		System.out.println(administrador2);

		// Funcionalidad que busque por direccion
		// Cuando el Administrador sea de Guamani, lo busque por cedula
		// Cuando el Administrador sea de Calderon, lo busca por apellido
		Administrador administrador3 = this.administradorService.buscarPorCriteria("Oli", "Guamani", "1750");
		System.out.println(administrador3);

		Asistente asistente = this.administradorService.buscarPorAreaCargo("Ventas");
		System.out.println(asistente);

	}

}
