package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageRestController {
	
	@Value("${msg: hola config server no esta funcionando}")
	private String msg;

	@RequestMapping("/msg")
	public String getMsg() {
		return this.msg; 
	}

	}
