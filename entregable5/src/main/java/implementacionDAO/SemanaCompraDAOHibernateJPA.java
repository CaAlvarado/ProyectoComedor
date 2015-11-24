package implementacionDAO;

import modelo.SemanaCompra;

public class SemanaCompraDAOHibernateJPA extends DAOHibernateJPA<SemanaCompra> {

	public SemanaCompraDAOHibernateJPA(){
		super(SemanaCompra.class);
	}
}
