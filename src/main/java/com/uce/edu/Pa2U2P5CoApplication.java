package com.uce.edu;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Alumno;
import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.service.IAlumnoService;
import com.uce.edu.service.IEstudianteService;

@SpringBootApplication
public class Pa2U2P5CoApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IAlumnoService alumnoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5CoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Estudiante estudiante1 = new Estudiante();
//		estudiante1.setNombre("Andres");
//		estudiante1.setApellido("Olivares");
//		estudiante1.setCedula("1750");
//		estudiante1.setFechaNacimiento(LocalDateTime.of(2000, 6, 12,0,0));
//		this.estudianteService.guardar(estudiante1);
//		
//		Estudiante estudiante2 = new Estudiante();
//		estudiante2.setNombre("Andres");
//		estudiante2.setApellido("Olivares");
//		estudiante2.setCedula("1750");
//		estudiante2.setFechaNacimiento(LocalDateTime.of(2000, 6, 12,0,0));
//		this.estudianteService.guardar(estudiante2);
		
		
//		Actualizar
//		Estudiante estudiante = this.estudianteService.buscar(12);
//		estudiante.setApellido("Calvache");
//		this.estudianteService.actualizar(estudiante);
		
		
//		Eliminar
//		this.estudianteService.eliminar(5);
		
// -----------------------------------------------------------------------------------		
		
		Alumno alumno1 = new Alumno();
		alumno1.setNombre("Roberto");
		this.alumnoService.guardar(alumno1);
		
		Alumno alumno2 = new Alumno();
		alumno2.setNombre("Carlos");
		this.alumnoService.guardar(alumno2);
		
//		Actualizar		
		Alumno alumno = this.alumnoService.buscar(1);
		alumno.setNombre("Lucho");
		this.alumnoService.actualizar(alumno);
		
//		Eliminar
		this.alumnoService.eliminar(1);
		
	}

}
