package modelo;

import java.io.File;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 * 
 */
@Entity
@DiscriminatorValue("P")
public class Persona extends Usuario {

    private Long idAlumno;
    private double saldo;
    private File foto;
    private String email;
    private boolean vegetariano;
    private boolean celiaco;
    private boolean hipertenso;
    private boolean toleranteLactosa;
    private boolean diabetico;
    private String tipo; 
    
    @ManyToMany 
    @JoinTable(name="PERSONA_FACULTAD",
    		joinColumns=@JoinColumn(name="PER_ID", referencedColumnName="id"),
    		inverseJoinColumns=@JoinColumn(name="FACU_ID", referencedColumnName="idFacultad"))	
    private List<Facultad> facultades;
    @OneToOne (optional = false)
    private Pago pago;

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public Long getIdAlumno() {
		return idAlumno;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public File getFoto() {
		return foto;
	}

	public void setFoto(File foto) {
		this.foto = foto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isVegetariano() {
		return vegetariano;
	}

	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}

	public boolean isCeliaco() {
		return celiaco;
	}

	public void setCeliaco(boolean celiaco) {
		this.celiaco = celiaco;
	}

	public boolean isHipertenso() {
		return hipertenso;
	}

	public void setHipertenso(boolean hipertenso) {
		this.hipertenso = hipertenso;
	}

	public boolean isToleranteLactosa() {
		return toleranteLactosa;
	}

	public void setToleranteLactosa(boolean toleranteLactosa) {
		this.toleranteLactosa = toleranteLactosa;
	}

	public boolean isDiabetico() {
		return diabetico;
	}

	public void setDiabetico(boolean diabetico) {
		this.diabetico = diabetico;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Facultad> getFacultades() {
		return facultades;
	}

	public void setFacultades(List<Facultad> facultades) {
		this.facultades = facultades;
	}




}