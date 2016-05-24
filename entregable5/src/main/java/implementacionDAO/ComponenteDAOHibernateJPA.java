package implementacionDAO;

import interfazDAO.ComponenteDAO;

import java.util.List;

import org.springframework.stereotype.Component;

import modelo.Componente;

@Component
public class ComponenteDAOHibernateJPA extends DAOHibernateJPA<Componente> implements ComponenteDAO {

	public ComponenteDAOHibernateJPA(){
		super(Componente.class);
	}
	
	@Override
	public List<Componente> recuperarComponentes(){
		return super.recuperarTodos("idComponente");
	}
}
