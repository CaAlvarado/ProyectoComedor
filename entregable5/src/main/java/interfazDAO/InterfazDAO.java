package interfazDAO;

import java.io.Serializable;

public interface InterfazDAO<T> {
	
	public T actualizar(T entity);
	public void borrar(T entity);
	public T borrar(Serializable id);
	public boolean existe(Serializable id);
	public T persistir(T entity);
	public T recuperar(Serializable id);
}
