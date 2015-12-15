package edu.ttps.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.ttps.dao.UsuarioDAO;
import edu.ttps.entity.Usuario;
import edu.ttps.service.UsuarioService;
 
@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioDAO UsuarioDAO;

    @Override
    public void createUsuario(Usuario Usuario) {
        UsuarioDAO.createUsuario(Usuario);
    }
    @Override
    public Usuario updateUsuario(Usuario Usuario) {
        return UsuarioDAO.updateUsuario(Usuario);
    }
    @Override
    public void deleteUsuario(long id) {
        UsuarioDAO.deleteUsuario(id);
    }
    @Override
    public List<Usuario> getAllUsuarios() {
        return UsuarioDAO.getAllUsuarios();
    }
    @Override
    public Usuario getUsuario(long id) {
        return UsuarioDAO.getUsuario(id);
    }
}