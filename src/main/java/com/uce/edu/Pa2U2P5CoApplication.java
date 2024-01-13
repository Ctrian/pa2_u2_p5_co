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
import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.repository.modelo.Libro2;
import com.uce.edu.service.ILibroService;

@SpringBootApplication
public class Pa2U2P5CoApplication implements CommandLineRunner {

	// 1. Query (JPQL)
	// 1.1 TypedQuery
	// 1.2 NamedQuery

	// 2. Native Query
	// 3. Criteria API Query

	@Autowired
	private ILibroService iLibroService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5CoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Query");
		List<Libro> lista = this.iLibroService.buscarPorFecha(LocalDateTime.of(1800, 1, 1, 7, 15));
		for (Libro libro : lista) {
			System.out.println(libro);
		}

		System.out.println("TypedQuery");

		Libro li1 = this.iLibroService.buscarPorNombre("Kotlin/Java");
		System.out.println(li1);

		List<Libro> lista2 = this.iLibroService.buscarPorFecha(LocalDateTime.of(1800, 1, 1, 7, 15));
		for (Libro libro : lista2) {
			System.out.println(libro);
		}

		System.out.println("NamedQuery");
		Libro li2 = this.iLibroService.buscarPorNombreNamed("Kotlin/Java");
		System.out.println(li2);

		List<Libro> lista3 = this.iLibroService.buscarPorFechaNamed(LocalDateTime.of(1800, 1, 1, 7, 15));
		for (Libro libro : lista3) {
			System.out.println(libro);
		}
	}

}
