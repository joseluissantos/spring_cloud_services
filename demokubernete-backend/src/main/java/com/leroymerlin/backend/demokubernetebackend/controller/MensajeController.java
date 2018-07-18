package com.leroymerlin.backend.demokubernetebackend.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensajeController {
	
	@RequestMapping(value="/mensaje_backend")
	public String getMensaje() throws UnknownHostException{
		return "hola desde backend "+ InetAddress.getLocalHost().getHostName();		
	}
	
}
