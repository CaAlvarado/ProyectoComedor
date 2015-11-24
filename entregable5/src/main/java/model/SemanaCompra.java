package model;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * 
 */
@Entity
public class SemanaCompra {

	@Id @GeneratedValue
    private Long idSemanaCompra;
    private Date fechaInit;
    private Date fechaFin;
    
    @OneToMany
    private List<Menu> lunes;
    @OneToMany
    private List<Menu> martes;
    @OneToMany
    private List<Menu> miercoles;
    @OneToMany
    private List<Menu> jueves;
    @OneToMany
    private List<Menu> viernes;
    
    @ManyToOne(optional = false)
    private Compra compra;

	public Long getIdSemanaCompra() {
		return idSemanaCompra;
	}

	public void setIdSemanaCompra(Long idSemanaCompra) {
		this.idSemanaCompra = idSemanaCompra;
	}

	public Date getFechaInit() {
		return fechaInit;
	}

	public void setFechaInit(Date fechaInit) {
		this.fechaInit = fechaInit;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public List<Menu> getLunes() {
		return lunes;
	}

	public void setLunes(List<Menu> lunes) {
		this.lunes = lunes;
	}

	public List<Menu> getMartes() {
		return martes;
	}

	public void setMartes(List<Menu> martes) {
		this.martes = martes;
	}

	public List<Menu> getMiercoles() {
		return miercoles;
	}

	public void setMiercoles(List<Menu> miercoles) {
		this.miercoles = miercoles;
	}

	public List<Menu> getJueves() {
		return jueves;
	}

	public void setJueves(List<Menu> jueves) {
		this.jueves = jueves;
	}

	public List<Menu> getViernes() {
		return viernes;
	}

	public void setViernes(List<Menu> viernes) {
		this.viernes = viernes;
	}






}