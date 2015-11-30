package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 */
@Entity
public class Sugerencia {
	
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idSugerencia;
    private String tipo;
    private String contenido;
    private boolean activo=true;
    
    @ManyToOne(optional = false)
    private Sede sede;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Long getIdSugerencia() {
		return idSugerencia;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}


}