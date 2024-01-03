package com.uce.edu;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.IHotelRepository;
import com.uce.edu.repository.modelo.Ciudadano;
import com.uce.edu.repository.modelo.Empleado;
import com.uce.edu.repository.modelo.Habitacion;
import com.uce.edu.repository.modelo.Hotel;
import com.uce.edu.service.ICiudadanoService;
import com.uce.edu.service.IEmpleadoService;
import com.uce.edu.service.IHotelService;

@SpringBootApplication
public class Pa2U2P5CoApplication implements CommandLineRunner{
	
	@Autowired
	private IHotelRepository hotelRepository;
	
	@Autowired
	private IHotelService hotelService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5CoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Hotel hotel = new Hotel();
		hotel.setDireccion("Colon");
		hotel.setNombre("Marriot");
		
		Habitacion habitacion1 = new Habitacion();
		habitacion1.setClase("Economica");
		habitacion1.setNumero("A1");
		habitacion1.setHotel(hotel);
		
		Habitacion habitacion2 = new Habitacion();
		habitacion2.setClase("Presidencial");
		habitacion2.setNumero("A2");
		habitacion2.setHotel(hotel);
		
		List<Habitacion> habitaciones = new ArrayList<>();
		habitaciones.add(habitacion1);
		habitaciones.add(habitacion2);
		
		hotel.setHabitaciones(habitaciones);
		
		this.hotelService.guardar(hotel);
	}

}
