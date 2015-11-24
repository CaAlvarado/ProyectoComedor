package implementacionDAO;

import modelo.Pago;

public class PagoDAOHibernateJPA extends DAOHibernateJPA<Pago> {

	public PagoDAOHibernateJPA(){
		super(Pago.class);
	}
}
