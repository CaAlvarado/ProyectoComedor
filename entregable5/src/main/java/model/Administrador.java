package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Administrador extends Usuario {
	
	@Id @GeneratedValue
    private Long idAdmin;
	
	@OneToMany (mappedBy = "administrador")
    private List<Sede> sedes;

    public void agregarResposable() {
        // TODO implement here
    }


	public Long getIdAdmin() {
		return idAdmin;
	}


	public void setIdAdmin(Long idAdmin) {
		this.idAdmin = idAdmin;
	}


	public List<Sede> getSedes() {
		return sedes;
	}


	public void setSedes(List<Sede> sedes) {
		this.sedes = sedes;
	}

}