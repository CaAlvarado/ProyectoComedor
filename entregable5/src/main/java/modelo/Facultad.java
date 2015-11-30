package modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * 
 */
@Entity
public class Facultad {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long idFacultad;
    private String nombre;
    private boolean activo=true;
    
    @ManyToMany (mappedBy = "facultades")
    private List<Persona> personas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setIdFacultad(Long idFacultad) {
		this.idFacultad = idFacultad;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}



}