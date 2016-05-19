package implementacionDAO;

import java.util.List;

import org.springframework.stereotype.Component;

import interfazDAO.ComponenteDAO;
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
