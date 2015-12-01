package implementacionDAO;

import modelo.Menu;

public class MenuDAOHibernateJPA extends DAOHibernateJPA<Menu> {

	public MenuDAOHibernateJPA(){
		super(Menu.class);
	}
}
