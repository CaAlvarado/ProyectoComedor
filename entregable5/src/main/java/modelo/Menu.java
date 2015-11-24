package modelo;

import java.io.File;

/**
 * 
 */
public class Menu {

    private String nombre;
    private boolean vegetariano;
    private double precioMenu;
    private Long idMenu;
    private boolean aptoCeliaco;
    private boolean aptoDiabetico;
    private boolean aptoLactosa;
    private boolean aptoHipertenso;
    private File imagen;
    private String dia;
    private Componente entrada;
    private Componente principal;
    private Componente bebida;
    private Componente postre;

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

	public void setIdMenu(Long idMenu) {
		this.idMenu = idMenu;
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





}