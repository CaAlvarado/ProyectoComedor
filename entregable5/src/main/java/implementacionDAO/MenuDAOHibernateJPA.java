package implementacionDAO;

import java.util.List;

import interfazDAO.MenuDAO;

import org.springframework.stereotype.Component;

import modelo.Menu;

@Component
public class MenuDAOHibernateJPA extends DAOHibernateJPA<Menu> implements MenuDAO {

	public MenuDAOHibernateJPA(){
		super(Menu.class);
	}

	@Override
	public List<Menu> recuperarMenus() {
		return super.recuperarTodos("idMenu");
	}
}
