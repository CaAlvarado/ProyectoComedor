package edu.ttps.controller;

import edu.ttps.entity.Usuario;
import edu.ttps.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService UsuarioService;

    @RequestMapping("createUsuario")
    public ModelAndView createUsuario(@ModelAttribute Usuario usuario) {
        return new ModelAndView("usuarioForm");
    }
    
    @RequestMapping("editUsuario")
    public ModelAndView editUsuario(@RequestParam long id, @ModelAttribute Usuario usuario) {
        usuario = UsuarioService.getUsuario(id);
        return new ModelAndView("usuarioForm", "usuarioObject", usuario);
    }
    
    @RequestMapping("saveUsuario")
    public ModelAndView saveUsuario(@ModelAttribute Usuario usuario) {
    	// Si el id del Usuario 0 entonces se crea el Usuario de lo contrario se actualiza 
        if(usuario.getId() == 0){ 
            UsuarioService.createUsuario(usuario);
        } else {
            UsuarioService.updateUsuario(usuario);
        }
        return new ModelAndView("redirect:getAllUsuarios");
    }
    
    @RequestMapping("deleteUsuario")
    public ModelAndView deleteUsuario(@RequestParam long id) {
        UsuarioService.deleteUsuario(id);
        return new ModelAndView("redirect:getAllUsuarios");
    }
    
    @RequestMapping(value = {"getAllUsuarios", "/"})
    public ModelAndView getAllUsuarios() {
        List<Usuario> usuarioList = UsuarioService.getAllUsuarios();
        return new ModelAndView("usuarioList", "usuarioList", usuarioList);
    }
}