package implementacionDAO;

import java.util.List;

import org.springframework.stereotype.Component;

import interfazDAO.MenuDAO;
import modelo.Menu;

@Component
public class MenuDAOHibernateJPA extends DAOHibernateJPA<Menu> implements MenuDAO{

	public MenuDAOHibernateJPA(){
		super(Menu.class);
	}
	
	public List<Menu> recuperarMenus(){
		return super.recuperarTodos("idMenu");
	}
}
