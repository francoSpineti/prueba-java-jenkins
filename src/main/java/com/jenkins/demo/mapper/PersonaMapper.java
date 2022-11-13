package com.jenkins.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.jenkins.demo.dto.PersonaDTO;
import com.jenkins.demo.entity.Persona;

@Mapper(componentModel = "spring")
public interface PersonaMapper {

	PersonaMapper INSTANCE = Mappers.getMapper( PersonaMapper.class );
	PersonaDTO personaToPersonaDTO(Persona persona);
	Persona personaDTOToPersona(PersonaDTO personaDTO);
	List<Persona> listaPersonaDTOToListaPersona(List<PersonaDTO> listaPersonaDTO);
	List<PersonaDTO> listaPersonaToListaPersonaDTO(List<Persona> listaPersona);
}
