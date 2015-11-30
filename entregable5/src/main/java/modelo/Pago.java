package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * 
 */
@Entity
public class Pago {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idPago;
    private double monto;
    private String fecha; 
    private boolean activo=true;
    
    @OneToOne (mappedBy = "pago")
    private Persona persona;
    
    @OneToOne(optional = false, mappedBy="pago")
    private Compra compra;
   @ManyToOne(optional = false)
    private Sede sede;

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Long getIdPago() {
		return idPago;
	}


	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}




}