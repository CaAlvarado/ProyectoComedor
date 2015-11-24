package implementacionDAO;

import modelo.Cartilla;

public class CartillaDAOHibernateJPA extends DAOHibernateJPA<Cartilla> {

	public CartillaDAOHibernateJPA(){
		super(Cartilla.class);
	}
}
