package implementacionDAO;

import modelo.Facultad;

public class FacultadDAOHibernateJPA extends DAOHibernateJPA<Facultad> {

	public FacultadDAOHibernateJPA(){
		super (Facultad.class);
	}
}
