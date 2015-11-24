package implementacionDAO;

import modelo.Administrador;

public class AdministradorDAOHibernateJPA extends DAOHibernateJPA<Administrador> {
	
	public AdministradorDAOHibernateJPA(){
		super (Administrador.class);
	}
}
