package implementacionDAO;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class DAOHibernateJPA<T> implements interfazDAO.InterfazDAO<T>{

	protected Class<T> persistentClass;
	
	public DAOHibernateJPA(){}
	
	public DAOHibernateJPA(Class<T> pc){
		persistentClass= pc;
	}
	@Override
	public T actualizar(T entity) {
		EntityManager em= EMF.getEmf().createEntityManager();
		EntityTransaction etx= em.getTransaction();
		etx.begin();
		T entidad=em.merge(entity);
		etx.commit();
		em.close();
		return entidad;
	}

	@Override
	public void borrar(T entity) {
		EntityManager em=EMF.getEmf().createEntityManager();
		EntityTransaction etx= null;
		try{
			etx = em.getTransaction();
			etx.begin();
			em.remove(entity);
			etx.commit();
		}
		catch (RuntimeException e){
			if (etx!= null && etx.isActive()) etx.rollback();
			throw e;
		}
		finally{
			em.close();
		}
	}

	@Override
	public T borrar(Serializable id) {
		T entity = EMF.getEmf().createEntityManager().find(this.getPersistentClass(), id);
		if (entity != null){
			this.borrar(entity);
		}
		return entity;
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	@Override
	public boolean existe(Serializable id) {
		T entity = EMF.getEmf().createEntityManager().find(this.getPersistentClass(), id);
		if (entity != null){
			return true;
		}
		return false;
	}

	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	@Override
	public T persistir(T entity) {
		EntityManager em= EMF.getEmf().createEntityManager();
		EntityTransaction etx=null;
		try{
			etx = em.getTransaction();
			etx.begin();
			em.persist(entity);
			etx.commit();
		}
		catch (RuntimeException e){
			if (etx !=null && etx.isActive()) etx.rollback();
			throw e;
		}
		finally{
			em.close();
		}
		return entity;
	}

	@Override
	public T recuperar(Serializable id) {
		T entity = EMF.getEmf().createEntityManager().find(this.getPersistentClass(), id);
		return entity;
	}

	public List<T> recuperarTodos(String orden){
		Query consulta= EMF.getEmf().createEntityManager().createQuery("select e from "+getPersistentClass().getSimpleName()+"e order by e."+orden);
		List<T> resultado = (List<T>) consulta.getResultList();
		return resultado;
	}
	
	public List<T> recuperarTodos(int cantidad, int limite, String orden){
		Query consulta= EMF.getEmf().createEntityManager().createQuery("select e from "+getPersistentClass().getSimpleName()+"e order by e."+orden+" limit "+cantidad+","+limite);
		List<T> resultado= (List<T>) consulta.getResultList();
		return resultado;
	}
	

	
}
