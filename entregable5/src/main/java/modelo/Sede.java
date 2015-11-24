package modelo;

import java.util.LinkedList;

/**
 * 
 */
public class Sede {

    private String direccion;
    private String nombre;
    private Long idSede;
    private LinkedList<Sugerencia> sugerencias;
    private LinkedList<Pago> pagos;
    private LinkedList<Cartilla> cartillas;
     
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getIdSede() {
		return idSede;
	}

	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}

	public LinkedList<Sugerencia> getSugerencias() {
		return sugerencias;
	}

	public void setSugerencias(LinkedList<Sugerencia> sugerencias) {
		this.sugerencias = sugerencias;
	}

	public LinkedList<Pago> getPagos() {
		return pagos;
	}

	public void setPagos(LinkedList<Pago> pagos) {
		this.pagos = pagos;
	}

	public LinkedList<Cartilla> getCartillas() {
		return cartillas;
	}

	public void setCartillas(LinkedList<Cartilla> cartillas) {
		this.cartillas = cartillas;
	}






}