package modelo;

/**
 * 
 */
public class Responsable extends Usuario {

    private boolean activo;
    private Long idResponsable;
    private Sede sede;

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Long getIdResponsable() {
		return idResponsable;
	}

	public void setIdResponsable(Long idResponsable) {
		this.idResponsable = idResponsable;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}



}