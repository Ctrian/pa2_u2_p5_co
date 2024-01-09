package com.uce.edu;

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
import com.uce.edu.repository.modelo.Autor2;
import com.uce.edu.repository.modelo.AutorLibro;
import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.repository.modelo.Libro2;
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
		Libro2 libro = new Libro2();
		libro.setTitulo("Java2");
		libro.setFechaPublicacion(LocalDateTime.now());
		
		Autor2 autor1 = new Autor2();
		autor1.setNacionalidad("Ecuatoriano2");
		autor1.setNombre("Pepito Perez2");
		
		Autor2 autor2 = new Autor2();
		autor2.setNacionalidad("Ecuatoriano2");
		autor2.setNombre("Daniel Teran2");
		
		List<Autor2> autores = new ArrayList<Autor2>();
		autores.add(autor1);
		autores.add(autor2);
		
		AutorLibro autorLibro1 = new AutorLibro();
		autorLibro1.setLibro2(libro);
		autorLibro1.setAutor2(autor1);
		autorLibro1.setFecha(LocalDateTime.now());
		
		AutorLibro autorLibro2 = new AutorLibro();
		autorLibro2.setLibro2(libro);
		autorLibro2.setAutor2(autor2);
		autorLibro2.setFecha(LocalDateTime.now());
		
		List<AutorLibro> lista = new ArrayList<>();
		lista.add(autorLibro1);
		lista.add(autorLibro2);
		
		libro.setAutoresLibros(lista);
		
		//this.iLibroService.guardar(libro);
		
		Libro libro3 = this.iLibroService.buscarPorNombre("Kotlin/Java");
		System.out.println(libro3);
	}

}
