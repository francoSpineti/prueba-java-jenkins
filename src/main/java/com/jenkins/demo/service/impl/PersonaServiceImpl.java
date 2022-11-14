package com.jenkins.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jenkins.demo.dto.PersonaDTO;
import com.jenkins.demo.mapper.PersonaMapper;
import com.jenkins.demo.repository.PersonaRepository;
import com.jenkins.demo.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{

	@Autowired
	private PersonaMapper mapper;

	@Autowired
	private PersonaRepository repository;

	
	/**
	 *
	 */
	@Override
	public void guardarPersona(PersonaDTO personaDto) {
		repository.save(mapper.personaDTOToPersona(personaDto));
	}

	/**
	 *
	 */
	@Override
	public List<PersonaDTO> obtenerPersonas() {
		return mapper.listaPersonaToListaPersonaDTO(repository.findAll());
	}

}
