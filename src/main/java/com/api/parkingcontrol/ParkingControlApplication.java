package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableCaching //essa anotação na minha classe principal starter é por conta do CACHE implementado
public class ParkingControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingControlApplication.class, args);
		
	
//	}
//	@GetMapping("/")
//	public String olaMundo(){
//		return "<h1>Parking Spot</h1> Olá, Mundo esse é um teste, aqui teremos vagas de estacionamento";
//	}
	}
}

//implementar histórico de alterações e um getbyplatecar