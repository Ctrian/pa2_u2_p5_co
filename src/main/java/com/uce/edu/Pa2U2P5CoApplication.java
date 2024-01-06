package com.uce.edu;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Autor;
import com.uce.edu.repository.modelo.Ciudadano;
import com.uce.edu.repository.modelo.Empleado;
import com.uce.edu.repository.modelo.Habitacion;
import com.uce.edu.repository.modelo.Hotel;
import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.service.ICiudadanoService;
import com.uce.edu.service.IHotelService;
import com.uce.edu.service.ILibroService;

@SpringBootApplication
public class Pa2U2P5CoApplication implements CommandLineRunner {

	@Autowired
	private ILibroService iLibroService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5CoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Libro libro = new Libro();
		libro.setTitulo("Java");
		libro.setFechaPublicacion(LocalDateTime.now());
		
		Autor autor1 = new Autor();
		autor1.setNacionalidad("Colombiana");
		autor1.setNombre("Carmen");
		//autor1.setLibros(null);
		
		Autor autor2 = new Autor();
		autor2.setNacionalidad("Austriaco");
		autor2.setNombre("Benjamin");
		//autor1.setLibros(null);
		
		Set<Autor> autores = new HashSet<Autor>();
		autores.add(autor1);
		autores.add(autor2);
		//Recibe un conjunto de autores
		libro.setAutores(autores);
		
		Set<Libro> libros = new HashSet<Libro>();
		libros.add(libro);
		
		autor1.setLibros(libros);
		autor2.setLibros(libros);
		
		//Al insertar el libro se insertaran los autores automaticamente por el Cascade
		this.iLibroService.guardar(libro);
	}

}
