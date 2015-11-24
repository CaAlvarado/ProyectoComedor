package implementacionDAO;

import modelo.Componente;

public class ComponenteDAOHibernateJPA extends DAOHibernateJPA<Componente> {

	public ComponenteDAOHibernateJPA(){
		super(Componente.class);
	}
}
