package modelo;

import java.util.LinkedList;

/**
 * 
 */
public class Facultad {

    private String nombre;
    private Long idFacultad;
    private LinkedList<Persona> personas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getIdFacultad() {
		return idFacultad;
	}

	public void setIdFacultad(Long idFacultad) {
		this.idFacultad = idFacultad;
	}

	public LinkedList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(LinkedList<Persona> personas) {
		this.personas = personas;
	}



}