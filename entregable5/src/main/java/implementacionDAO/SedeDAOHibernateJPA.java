package implementacionDAO;

import modelo.Sede;

public class SedeDAOHibernateJPA extends DAOHibernateJPA<Sede> {

	public SedeDAOHibernateJPA(){
		super(Sede.class);
	}
}
