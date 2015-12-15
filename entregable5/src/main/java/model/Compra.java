package model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Compra {

	@Id @GeneratedValue
    private Long idCompra;
    private boolean llevar;
    private double total;
    
    @OneToMany(mappedBy="compra")
    private List<SemanaCompra> semanas;
    
    @OneToOne(optional = false)
    private Pago pago;
    
	public Long getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Long idCompra) {
		this.idCompra = idCompra;
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



}