package modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * 
 */
@Entity
@DiscriminatorValue("R")
public class Responsable extends Usuario {

    private Long idResponsable;
    
    @OneToOne (mappedBy = "resposable")
    private Sede sede;


	public Long getIdResponsable() {
		return idResponsable;
	}


	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}



}