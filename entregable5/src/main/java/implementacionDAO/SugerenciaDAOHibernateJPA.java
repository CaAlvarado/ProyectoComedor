package implementacionDAO;

import modelo.Sugerencia;

public class SugerenciaDAOHibernateJPA extends DAOHibernateJPA<Sugerencia> {

	public SugerenciaDAOHibernateJPA(){
		super (Sugerencia.class);
	}
}
