package com.jenkins.demo.dto;
import java.util.Date;

public class PersonaDTO {

	private Long id;
	private String nombre;
	private String apellido;
	private Integer edad;
	private Date fechaNacimiento;

	/**
	 * 
	 */
	public PersonaDTO() {
		super();
	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param fechaNacimiento
	 */
	public PersonaDTO(Long id, String nombre, String apellido, Integer edad, Date fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNacimiento = new Date(fechaNacimiento.getTime());
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento != null ? fechaNacimiento : new Date(fechaNacimiento.getTime());
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = new Date(fechaNacimiento.getTime());
	}
}
