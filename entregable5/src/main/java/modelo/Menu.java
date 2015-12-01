package modelo;

import java.io.File;

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
public class Menu {

    private String nombre;
    private boolean vegetariano;
    private double precioMenu;
    private boolean activo=true;
    
    
    
    
    @ManyToOne(optional=true)
    private Cartilla cartilla;
    
   
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idMenu;
    private boolean aptoCeliaco;
    private boolean aptoDiabetico;
    private boolean aptoLactosa;
    private boolean aptoHipertenso;
    private File imagen;
    private String dia;
    
    @OneToOne(optional = true)
    private Componente entrada;
    @OneToOne(optional = false)
    private Componente principal;
    @OneToOne(optional = true)
    private Componente bebida;
    @OneToOne(optional = true)
    private Componente postre;
    
    
    public Cartilla getCartilla() {
		return cartilla;
	}

	public void setCartilla(Cartilla cartilla) {
		this.cartilla = cartilla;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isVegetariano() {
		return vegetariano;
	}

	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}

	public double getPrecioMenu() {
		return precioMenu;
	}

	public void setPrecioMenu(double precioMenu) {
		this.precioMenu = precioMenu;
	}

	public Long getIdMenu() {
		return idMenu;
	}


	public boolean isAptoCeliaco() {
		return aptoCeliaco;
	}

	public void setAptoCeliaco(boolean aptoCeliaco) {
		this.aptoCeliaco = aptoCeliaco;
	}

	public boolean isAptoDiabetico() {
		return aptoDiabetico;
	}

	public void setAptoDiabetico(boolean aptoDiabetico) {
		this.aptoDiabetico = aptoDiabetico;
	}

	public boolean isAptoLactosa() {
		return aptoLactosa;
	}

	public void setAptoLactosa(boolean aptoLactosa) {
		this.aptoLactosa = aptoLactosa;
	}

	public boolean isAptoHipertenso() {
		return aptoHipertenso;
	}

	public void setAptoHipertenso(boolean aptoHipertenso) {
		this.aptoHipertenso = aptoHipertenso;
	}

	public File getImagen() {
		return imagen;
	}

	public void setImagen(File imagen) {
		this.imagen = imagen;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Componente getEntrada() {
		return entrada;
	}

	public void setEntrada(Componente entrada) {
		this.entrada = entrada;
	}

	public Componente getPrincipal() {
		return principal;
	}

	public void setPrincipal(Componente principal) {
		this.principal = principal;
	}

	public Componente getBebida() {
		return bebida;
	}

	public void setBebida(Componente bebida) {
		this.bebida = bebida;
	}

	public Componente getPostre() {
		return postre;
	}

	public void setPostre(Componente postre) {
		this.postre = postre;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	



}