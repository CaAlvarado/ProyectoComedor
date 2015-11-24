package modelo;

import java.util.LinkedList;

/**
 * 
 */
public class Compra {

    private Long idCompra;
    private boolean llevar;
    private double total;
    private LinkedList<SemanaCompra> semanas;

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

	public LinkedList<SemanaCompra> getSemanas() {
		return semanas;
	}

	public void setSemanas(LinkedList<SemanaCompra> semanas) {
		this.semanas = semanas;
	}



}