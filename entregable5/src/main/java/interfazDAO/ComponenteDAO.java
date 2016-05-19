package interfazDAO;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import modelo.Componente;

@Component
public interface ComponenteDAO {
	
	public Componente persistir(Componente componente);
	public List<Componente> recuperarComponentes();
	public Componente actualizar(Componente componente);
	public void borrar(Serializable id);
}
