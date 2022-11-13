package com.jenkins.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jenkins.demo.dto.PersonaDTO;

@Service
public interface PersonaService {

	void guardarPersona(PersonaDTO personaDto);
	List<PersonaDTO> obtenerPersonas();
}
