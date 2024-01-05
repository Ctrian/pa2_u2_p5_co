package com.uce.edu;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Ciudadano;
import com.uce.edu.repository.modelo.Empleado;
import com.uce.edu.service.ICiudadanoService;

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
		
		//Guardar
		Ciudadano ciudadano = new Ciudadano();
		ciudadano.setNombre("Carlos");
		ciudadano.setApellido("Acurio");
		this.ciudadanoService.guardar(ciudadano);
		
		Ciudadano ciudadano1 = new Ciudadano();
		ciudadano1.setNombre("Carlitos");
		ciudadano1.setApellido("Castro");
		this.ciudadanoService.guardar(ciudadano1);
		
		Empleado empleado1 = new Empleado();
		empleado1.setFechaIngreso(LocalDateTime.now());
		empleado1.setSalario(new BigDecimal(400));
		empleado1.setCiudadano(ciudadano1);
		
		//Actualizar
		ciudadano.setNombre("Carmen");
		ciudadano.setApellido("Castro");
		this.ciudadanoService.actualizar(ciudadano);
		
		//Eliminar
		this.ciudadanoService.eliminar(3);
		
		//Buscar
		Ciudadano ciudadano2 = new Ciudadano();
		ciudadano2.setNombre("Julio");
		ciudadano2.setApellido("Caviedes");
		this.ciudadanoService.guardar(ciudadano2);
		
		Empleado empleado2 = new Empleado();
		empleado2.setFechaIngreso(LocalDateTime.now());
		empleado2.setSalario(new BigDecimal(400));
		empleado2.setCiudadano(ciudadano2);
		
		this.ciudadanoService.buscar(4);
		System.out.println(ciudadano2);
		
	}

}
