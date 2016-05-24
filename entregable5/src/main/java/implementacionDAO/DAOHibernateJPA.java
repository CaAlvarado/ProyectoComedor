package implementacionDAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class DAOHibernateJPA<T> implements interfazDAO.InterfazDAO<T>{

	@PersistenceContext
	protected EntityManager entityManager;
	
	protected Class<T> persistentClass;
	
	public DAOHibernateJPA(){
		
	}
	
	public DAOHibernateJPA(Class<T> pc){
		persistentClass=pc;
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	
	@Override
	public T actualizar(T entity) {
		this.getEntityManager().merge(entity);
		return entity;
	}

	@Override
	public void borrar(Serializable id) {
		this.getEntityManager().remove(this.getEntityManager().find(this.getPersistentClass(), id));
	}

	@Override
	public void borrar(T entity) {
		this.getEntityManager().remove(entity);
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	@Override
	public boolean existe(Serializable id) {
		T entity = this.getEntityManager().find(this.getPersistentClass(), id);
		if (entity != null){
			return true;
		}
		return false;
	}

	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}
	
	@Transactional
	@Override
	public T persistir(T entity) {
		this.getEntityManager().persist(entity);
		return entity;
	}

	@Override
	public T recuperar(Serializable id) {
		T entity = this.getEntityManager().find(this.getPersistentClass(), id);
		return entity;
	}

	public List<T> recuperarTodos(String orden){
		Query consulta= this.getEntityManager().createQuery("select e from "+getPersistentClass().getSimpleName()+" e order by e."+orden);
		List<T> resultado = consulta.getResultList();
		return resultado;
	}
	
	public List<T> recuperarTodos(int cantidad, int limite, String orden){
		Query consulta= this.getEntityManager().createQuery("select e from "+getPersistentClass().getSimpleName()+" e order by e."+orden+" limit "+cantidad+","+limite);
		List<T> resultado= consulta.getResultList();
		return resultado;
	}
	

	
}
