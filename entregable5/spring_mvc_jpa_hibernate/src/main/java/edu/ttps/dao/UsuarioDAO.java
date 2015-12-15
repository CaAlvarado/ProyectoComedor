package edu.ttps.dao;

import java.util.List;

import edu.ttps.entity.Usuario;
 
public interface UsuarioDAO {
    public void createUsuario(Usuario Usuario);
    public Usuario updateUsuario(Usuario Usuario);
    public void deleteUsuario(long id);
    public List<Usuario> getAllUsuarios();
    public Usuario getUsuario(long id);
}