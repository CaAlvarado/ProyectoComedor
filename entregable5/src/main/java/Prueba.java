import implementacionDAO.*;
import modelo.*;

public class Prueba {

	public static void main(String[] args) {
		
		Administrador administrador= new Administrador();
		AdministradorDAOHibernateJPA admindao= DAOFactory.getAdministradorDAOHibernateJPA();
		admindao.persistir(administrador);
		administrador.setApellido("Alvarado");
		administrador.setNombre("Cristian");
		administrador.setDni(37845443);
		System.out.println(administrador.getDni());
		admindao.actualizar(administrador);
		Componente compo= new Componente();
		ComponenteDAOHibernateJPA compodao= DAOFactory.getComponenteDAOHibernateJPA();
		compodao.persistir(compo);
		compo.setNombre("Pollo con papas");
		compo.setAptoCeliaco(false);
		compo.setAptoDiabetico(true);
		compo.setAptoHipertenso(false);
		compo.setAptoLactosa(true);
		compodao.actualizar(compo);
		administrador.setActivo(false);
		
	}

}
