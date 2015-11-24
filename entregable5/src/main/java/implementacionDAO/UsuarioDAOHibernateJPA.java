package implementacionDAO;

import modelo.Usuario;

public class UsuarioDAOHibernateJPA extends DAOHibernateJPA<Usuario> {

	public UsuarioDAOHibernateJPA(){
		super (Usuario.class);
	}
}
