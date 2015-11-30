package modelo;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Compra {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idCompra;
    private boolean llevar;
    private double total;
    private boolean activo=true;
    
    @OneToMany(mappedBy="compra")
    private List<SemanaCompra> semanas;
    
    @OneToOne(optional = false)
    private Pago pago;
    
	public Long getIdCompra() {
		return idCompra;
	}


	public boolean isLlevar() {
		return llevar;
	}

	public void setLlevar(boolean llevar) {
		this.llevar = llevar;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<SemanaCompra> getSemanas() {
		return semanas;
	}

	public void setSemanas(LinkedList<SemanaCompra> semanas) {
		this.semanas = semanas;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}



}