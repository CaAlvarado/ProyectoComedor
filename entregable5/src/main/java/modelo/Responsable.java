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
    
    @OneToOne (mappedBy = "resposable")
    private Sede sede;


	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}



}