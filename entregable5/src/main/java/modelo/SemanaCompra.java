package modelo;

import java.util.*;

/**
 * 
 */
public class SemanaCompra {

    private Long idSemanaCompra;
    private Date fechaInit;
    private Date fechaFin;
    private LinkedList<Menu> lunes;
    private LinkedList<Menu> martes;
    private LinkedList<Menu> miercoles;
    private LinkedList<Menu> jueves;
    private LinkedList<Menu> viernes;

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

	public LinkedList<Menu> getLunes() {
		return lunes;
	}

	public void setLunes(LinkedList<Menu> lunes) {
		this.lunes = lunes;
	}

	public LinkedList<Menu> getMartes() {
		return martes;
	}

	public void setMartes(LinkedList<Menu> martes) {
		this.martes = martes;
	}

	public LinkedList<Menu> getMiercoles() {
		return miercoles;
	}

	public void setMiercoles(LinkedList<Menu> miercoles) {
		this.miercoles = miercoles;
	}

	public LinkedList<Menu> getJueves() {
		return jueves;
	}

	public void setJueves(LinkedList<Menu> jueves) {
		this.jueves = jueves;
	}

	public LinkedList<Menu> getViernes() {
		return viernes;
	}

	public void setViernes(LinkedList<Menu> viernes) {
		this.viernes = viernes;
	}






}