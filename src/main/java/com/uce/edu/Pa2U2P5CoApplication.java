package com.uce.edu;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Autor;
import com.uce.edu.repository.modelo.Libro;
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
		
		//guardar
		Libro libro1 = new Libro();
		libro1.setTitulo("Java");
		libro1.setFechaPublicacion(LocalDateTime.now());
		
		Autor autor1 = new Autor();
		autor1.setNacionalidad("Colombiana");
		autor1.setNombre("Carmen");
		//autor1.setLibros(null);
		
		Autor autor2 = new Autor();
		autor2.setNacionalidad("Austriaco");
		autor2.setNombre("Benjamin");
		//autor1.setLibros(null);
		
		Set<Autor> autores1 = new HashSet<Autor>();
		autores1.add(autor1);
		autores1.add(autor2);
		//Recibe un conjunto de autores
		libro1.setAutores(autores1);
		
		Set<Libro> libros1 = new HashSet<Libro>();
		libros1.add(libro1);
		
		autor1.setLibros(libros1);
		autor2.setLibros(libros1);
		
		//Al insertar el libro se insertaran los autores automaticamente por el Cascade
		this.iLibroService.guardar(libro1);
		
		//Autor que tiene 2 libros
		Autor autor3 = new Autor();
		autor3.setNacionalidad("Peruano");
		autor3.setNombre("Victor");
		
		Libro libro2 = new Libro();
		libro2.setFechaPublicacion(LocalDateTime.of(2020, 11, 27, 13, 25));
		libro2.setTitulo("Comercio Exterior");
		this.iLibroService.guardar(libro2);
		
		Libro libro3 = new Libro();
		libro3.setFechaPublicacion(LocalDateTime.of(2018, 12, 27, 13, 25));
		libro3.setTitulo("Economía Regional");
		this.iLibroService.guardar(libro3);
		
		//Creo la coleccion de libros
		Set<Libro> libros2 = new HashSet<Libro>();
		libros2.add(libro2);
		libros2.add(libro3);
		
		//seteo al autor la coleccion de libros
		autor3.setLibros(libros2);
		
		//Creo la coleccion de autor/es que setearemos los dos libros
		Set<Autor> autores2 = new HashSet<Autor>();
		autores2.add(autor3);
		
		//Seteo los 2 libros con el mismo autor
		libro2.setAutores(autores2);
		libro3.setAutores(autores2);
		
		
		//Actualizar
		libro2.setFechaPublicacion(LocalDateTime.of(1999, 06, 13, 9, 28));
		libro2.setTitulo("Kotlin/Java");
		
		Set<Autor> autoresActualizados = new HashSet<Autor>();
		autoresActualizados.add(autor1);
		autoresActualizados.add(autor2);
		libro2.setAutores(autoresActualizados);
		
		this.iLibroService.actualizar(libro2);
		
		//Eliminar
		this.iLibroService.eliminar(1);
		
		//Buscar
		this.iLibroService.buscar(2);
		
	}

}
