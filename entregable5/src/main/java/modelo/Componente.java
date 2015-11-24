package modelo;

/**
 * 
 */
public class Componente {

    private String nombre;
    private boolean aptoCeliaco;
    private boolean aptoDiabetico;
    private boolean aptoLactosa;
    boolean aptoHipertenso;
    private Long idComponente;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public Long getIdComponente() {
		return idComponente;
	}

	public void setIdComponente(Long idComponente) {
		this.idComponente = idComponente;
	}

}