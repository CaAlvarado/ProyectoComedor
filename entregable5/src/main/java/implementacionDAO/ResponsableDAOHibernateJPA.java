package implementacionDAO;

import modelo.Responsable;

public class ResponsableDAOHibernateJPA extends DAOHibernateJPA<Responsable> {
	
	public ResponsableDAOHibernateJPA(){
		super(Responsable.class);
	}
}
