package com.leroymerlin.frotend.demokubernetefrontend.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class kubernete_frontend {

	@RequestMapping(value="/cliente")
	public String mensajeCliente(){
		
		RestTemplate restTemplate=new RestTemplate();
		String resourceUrl="http://demokubernete-backend:8003/mensaje_backend";
		
		//LLamamos al servicio rest
		ResponseEntity<String> response= restTemplate.getForEntity(resourceUrl, String.class);
		
		return "mensaje desde el backend: "+response.getBody();		
	}
	
}
