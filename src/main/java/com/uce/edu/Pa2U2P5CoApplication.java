package com.uce.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Ciudadano;
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
		Ciudadano ciudadano = this.ciudadanoService.buscarPorApellido("Oli");
		System.out.println(ciudadano);

		// select c1_0.ciud_id,c1_0.ciud_apellido,c1_0.ciud_cedula,c1_0.ciud_nombre from
		// ciudadano c1_0 where c1_0.ciud_nombre=?
		Ciudadano ciudadano1 = this.ciudadanoService.buscarPorCriteria("Ctrian", "Oli", "1717");
		System.out.println(ciudadano1);

		// select c1_0.ciud_id,c1_0.ciud_apellido,c1_0.ciud_cedula,c1_0.ciud_nombre from
		// ciudadano c1_0 where c1_0.ciud_apellido=?
		Ciudadano ciudadano2 = this.ciudadanoService.buscarPorCriteria("Ctrian", "Oli", "0517");
		System.out.println(ciudadano2);

		// select c1_0.ciud_id,c1_0.ciud_apellido,c1_0.ciud_cedula,c1_0.ciud_nombre from
		// ciudadano c1_0 where c1_0.ciud_cedula=?
		Ciudadano ciudadano3 = this.ciudadanoService.buscarPorCriteria("Ctrian", "Oli", "0368");
		System.out.println(ciudadano3);

		System.out.println("Criteria API Query AND OR");
		// select c1_0.ciud_id,c1_0.ciud_apellido,c1_0.ciud_cedula,c1_0.ciud_nombre from
		// ciudadano c1_0 where c1_0.ciud_nombre=?
		Ciudadano ciudadano4 = this.ciudadanoService.buscarPorCriteria("Ctrian", "Olixxx", "1717");
		System.out.println(ciudadano4);

		System.out.println("Criteria API Query AND OR");
		// select c1_0.ciud_id,c1_0.ciud_apellido,c1_0.ciud_cedula,c1_0.ciud_nombre from
		// ciudadano c1_0 where c1_0.ciud_apellido=?
		Ciudadano ciudadano5 = this.ciudadanoService.buscarPorCriteria("Ctrian", "Oli", "0517");
		System.out.println(ciudadano5);
	}

}
