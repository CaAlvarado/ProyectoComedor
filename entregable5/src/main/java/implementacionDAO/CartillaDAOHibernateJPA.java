package implementacionDAO;

import org.springframework.stereotype.Component;

import modelo.Cartilla;

@Component
public class CartillaDAOHibernateJPA extends DAOHibernateJPA<Cartilla> {

	public CartillaDAOHibernateJPA(){
		super(Cartilla.class);
	}
}
