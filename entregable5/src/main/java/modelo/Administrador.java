package modelo;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
@DiscriminatorValue("A")
public class Administrador extends Usuario {
	
	
	@OneToMany (mappedBy = "administrador")
    private List<Sede> sedes;

    public void agregarResposable() {
        // TODO implement here
    }


	public List<Sede> getSedes() {
		return sedes;
	}


	public void setSedes(List<Sede> sedes) {
		this.sedes = sedes;
	}

}