import implementacionDAO.ComponenteDAOHibernateJPA;
import implementacionDAO.DAOFactory;
import implementacionDAO.MenuDAOHibernateJPA;
import modelo.Componente;
import modelo.Menu;


public class PruebaMenu {

	public static void main(String[] args) {
		
		Componente compo= new Componente();
		ComponenteDAOHibernateJPA compodao= DAOFactory.getComponenteDAOHibernateJPA();
		compodao.persistir(compo);
		compo.setNombre("Pollo con papas");
		compo.setAptoCeliaco(true);
		compo.setAptoDiabetico(true);
		compo.setAptoHipertenso(false);
		compo.setAptoLactosa(true);
		compodao.actualizar(compo);
		Componente compo2= new Componente();
		compo2.setNombre("Coca Cola");
		compo2.setAptoCeliaco(true);
		
		Menu menu= new Menu();
		MenuDAOHibernateJPA menudao= DAOFactory.getMenuDAOHibernateJPA();
		menu.setNombre("Menu de pollo con papas");
		menu.setPrincipal(compo);
		menudao.persistir(menu);
		
		menu.setAptoCeliaco(compo.isAptoCeliaco());
		menu=menudao.actualizar(menu);
	}

}
