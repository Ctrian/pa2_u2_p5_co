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
import com.uce.edu.service.IEmpleadoService;

@SpringBootApplication
public class Pa2U2P5CoApplication implements CommandLineRunner{
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	@Autowired
	private ICiudadanoService ciudadanoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5CoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Ciudadano ciudadano1 = new Ciudadano();
//		ciudadano1.setNombre("Andres");
//		ciudadano1.setApellido("Olivares");
//		this.ciudadanoService.guardar(ciudadano1);
		
		Empleado empleado1 = new Empleado();
		empleado1.setFechaIngreso(LocalDateTime.now());
		empleado1.setSalario(new BigDecimal(100));
		empleado1.setCiudadano(this.ciudadanoService.buscar(1));
		this.empleadoService.guardar(empleado1);
		
		
	}

}
