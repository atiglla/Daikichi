package com.example.nombreproyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")
public class Proyecto2Application {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto2Application.class, args);
	}
		
	
	@RequestMapping("/{travel}/{lugar}")
	public String showLección(@PathVariable("travel") String track, @PathVariable("lugar") String modulo){
	  	return "Congratulations You will soon " + track + " to " + modulo;
	}
	
	@RequestMapping("/lotto/{number}")
	public String showLección2(@PathVariable("number") int number){
	  	if (number%2==0) {
	  		return "Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras";
	  	}else {
	  		return "Has disfrutado de los frutos de tu trabajo, pero ahora es un buen momento para pasar tiempo con familiares y amigos";
	  	}
	}

}
