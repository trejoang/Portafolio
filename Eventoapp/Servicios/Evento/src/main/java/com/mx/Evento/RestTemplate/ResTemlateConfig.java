package com.mx.Evento.RestTemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration// declara que esta clase es una configuracion por lo tanto debe ser gestionada por el contenedor de beans para poder inyectar
public class ResTemlateConfig {
	
	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	//Restemplate es una clase proporcionada por Spring Framework paraa realizar llamadas http sincronas a servicios RESfull desde el cliente

}
