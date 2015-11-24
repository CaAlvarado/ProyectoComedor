package implementacionDAO;

import modelo.Persona;

public class PersonaDAOHibernateJPA extends DAOHibernateJPA<Persona> {
	
	public PersonaDAOHibernateJPA(){
		super(Persona.class);
	}
}
