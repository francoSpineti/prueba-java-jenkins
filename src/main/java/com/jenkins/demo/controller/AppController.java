package com.jenkins.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenkins.demo.dto.PersonaDTO;
import com.jenkins.demo.service.PersonaService;

@RestController
public class AppController {

	@Autowired
	private PersonaService service;
	
	@GetMapping("/")
	public String saludar() {
		return "hola";
	}
	
	@GetMapping("/personas")
	public List<PersonaDTO> obtenerPersonas() {
		return this.service.obtenerPersonas();
	}	
	
}
