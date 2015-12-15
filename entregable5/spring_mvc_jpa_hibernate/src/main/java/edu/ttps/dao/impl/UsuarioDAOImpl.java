package edu.ttps.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.ttps.dao.UsuarioDAO;
import edu.ttps.entity.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void createUsuario(Usuario Usuario) {
		entityManager.persist(Usuario);
	}
	@Override
	public Usuario updateUsuario(Usuario Usuario) {
		entityManager.merge(Usuario);
		return Usuario;
	}
	@Override
	public void deleteUsuario(long id) {
		/*Usuario Usuario = new Usuario();
		Usuario.setId(id);
		*/
		entityManager.remove(entityManager.find(Usuario.class, id));
	}
	
	@Override
	public List<Usuario> getAllUsuarios() {
		Query query = entityManager.createQuery("SELECT e FROM Usuario e");
		return (List<Usuario>)query.getResultList();
	}

	@Override
	public Usuario getUsuario(long id) {
		return (Usuario) entityManager.find(
				Usuario.class, id);
	}
}