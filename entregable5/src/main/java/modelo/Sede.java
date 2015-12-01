package modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * 
 */
@Entity
public class Sede {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long idSede;
    private String direccion;
    private String nombre;
    private boolean activo=true;
    @OneToMany(mappedBy="sede")
    private List<Sugerencia> sugerencias;
    
    @OneToMany(mappedBy="sede")
    private List<Pago> pagos;
    
    @OneToMany(mappedBy = "sede")
    private List<Cartilla> cartillas; 
     
    @OneToOne (mappedBy = "sede")
    private Responsable resposable;
    
    @ManyToOne (optional = true)
    private Administrador administrador;
	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	public Responsable getResposable() {
		return resposable;
	}

	public void setResposable(Responsable resposable) {
		this.resposable = resposable;
	}

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


	public List<Sugerencia> getSugerencias() {
		return sugerencias;
	}

	public void setSugerencias(List<Sugerencia> sugerencias) {
		this.sugerencias = sugerencias;
	}

	public List<Pago> getPagos() {
		return pagos;
	}

	public void setPagos(List<Pago> pagos) {
		this.pagos = pagos;
	}

	public List<Cartilla> getCartillas() {
		return cartillas;
	}

	public void setCartillas(List<Cartilla> cartillas) {
		this.cartillas = cartillas;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}






}