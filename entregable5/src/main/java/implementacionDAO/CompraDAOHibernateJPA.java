package implementacionDAO;

import modelo.Compra;

public class CompraDAOHibernateJPA extends DAOHibernateJPA<Compra> {

	public CompraDAOHibernateJPA(){
		super(Compra.class);
	}
}
