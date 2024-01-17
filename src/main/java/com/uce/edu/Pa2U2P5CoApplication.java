package com.uce.edu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Autor2;
import com.uce.edu.repository.modelo.AutorLibro;
import com.uce.edu.repository.modelo.Ciudadano;
import com.uce.edu.repository.modelo.Empleado;
import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.repository.modelo.Libro2;
import com.uce.edu.service.ICiudadanoService;
import com.uce.edu.service.ILibroService;

@SpringBootApplication
public class Pa2U2P5CoApplication implements CommandLineRunner {

	@Autowired
	private ICiudadanoService ciudadanoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5CoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Empleado empleado = new Empleado();

		Ciudadano ciudadano = new Ciudadano();
		ciudadano.setNombre("Ctrian");
		ciudadano.setApellido("Oli");
		ciudadano.setCedula("1717");
		ciudadano.setEmpleado(empleado);

		empleado.setCiudadano(ciudadano);

		this.ciudadanoService.guardar(ciudadano);

		Empleado emp = this.ciudadanoService.buscarPorCedula("1717");
		System.out.println(emp);

		Ciudadano ciu = this.ciudadanoService.buscarPorCedulaCiu("1717");
		System.out.println(ciu);
	}

}
