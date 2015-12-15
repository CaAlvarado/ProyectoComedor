package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 */
@Entity
public class Sugerencia {
	
    @Id @GeneratedValue
    private Long idSugerencia;
    private String tipo;
    private String contenido;
    
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

	public void setIdSugerencia(Long idSugerencia) {
		this.idSugerencia = idSugerencia;
	}

}