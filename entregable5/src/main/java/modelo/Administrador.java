package modelo;

import java.util.LinkedList;

/**
 * 
 */
public class Administrador extends Usuario {

    private Long idAdmin;
    private LinkedList<Sede> sedes;

    public void agregarResposable() {
        // TODO implement here
    }


	public Long getIdAdmin() {
		return idAdmin;
	}


	public void setIdAdmin(Long idAdmin) {
		this.idAdmin = idAdmin;
	}


	public LinkedList<Sede> getSedes() {
		return sedes;
	}


	public void setSedes(LinkedList<Sede> sedes) {
		this.sedes = sedes;
	}

}