package modelo;

import java.util.*; 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Cartilla {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idCartilla;
    private Calendar fechaInit;
    private Calendar fechaFin;
    private String nombre;
    private boolean activo=true;
    
    @OneToMany(mappedBy="cartilla")
    private List<Menu> lunes;
    @OneToMany(mappedBy="cartilla")
    private List<Menu> martes;
    @OneToMany(mappedBy="cartilla")
    private List<Menu> miercoles;
    @OneToMany(mappedBy="cartilla")
    private List<Menu> jueves;
    @OneToMany(mappedBy="cartilla")
    private List<Menu> viernes;
    
    @ManyToOne(optional = false)
    private Sede sede;
    
	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public Long getIdCartilla() {
		return idCartilla;
	}


	public Calendar getFechaInit() {
		return fechaInit;
	}

	public void setFechaInit(Calendar fechaInit) {
		this.fechaInit = fechaInit;
	}

	public Calendar getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Calendar fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}






}