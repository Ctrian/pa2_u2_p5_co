package com.uce.edu;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Ciudadano;
import com.uce.edu.repository.modelo.Empleado;
import com.uce.edu.repository.modelo.Habitacion;
import com.uce.edu.repository.modelo.Hotel;
import com.uce.edu.service.ICiudadanoService;
import com.uce.edu.service.IHotelService;

@SpringBootApplication
public class Pa2U2P5CoApplication implements CommandLineRunner {

	@Autowired
	private IHotelService hotelService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5CoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Guardar
		Hotel hotel2 = new Hotel(); 
		hotel2.setDireccion("Gasca");
		hotel2.setNombre("Coloso");
		
		Habitacion habitacion1 = new Habitacion();
		habitacion1.setClase("Economica");
		habitacion1.setNumero("A1");
		habitacion1.setHotel(hotel2);
		
		Habitacion habitacion2 = new Habitacion();
		habitacion2.setClase("Normal");
		habitacion2.setNumero("A2");
		habitacion2.setHotel(hotel2);
		
		List<Habitacion> habitaciones = new ArrayList<>();
		habitaciones.add(habitacion1);
		habitaciones.add(habitacion2);

		hotel2.setHabitaciones(habitaciones);

		this.hotelService.guardar(hotel2);
		
		//Actualizar
		hotel2.setNombre("Swisottel");
		hotel2.setDireccion("Centro");
		this.hotelService.actualizar(hotel2);
		
		//Eliminar
		this.hotelService.eliminar(1);
		
		//Buscar
		this.hotelService.buscar(2);
		System.out.println(hotel2);
		
	}

}
