package edu.ttps.service;

import java.util.List;

import edu.ttps.entity.Usuario;
 
public interface UsuarioService {
    public void createUsuario(Usuario Usuario);
    public Usuario updateUsuario(Usuario Usuario);
    public void deleteUsuario(long id);
    public List<Usuario> getAllUsuarios();
    public Usuario getUsuario(long id);
}