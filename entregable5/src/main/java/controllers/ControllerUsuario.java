package controllers;

import java.util.List;

import interfazDAO.AdministradorDAO;
import interfazDAO.ResponsableDAO;
import interfazDAO.UsuarioDAO;

import javax.servlet.http.HttpSession;

import modelo.Administrador;
import modelo.Responsable;
import modelo.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerUsuario {

	@Autowired
	private UsuarioDAO usuariodao;
	
	@Autowired
	private ResponsableDAO respodao;
	
	@Autowired
	private AdministradorDAO admindao;
	
	@RequestMapping("crearAdmin")
	public ModelAndView agregarAdmin(@ModelAttribute Administrador administrador, HttpSession sesion){
		return new ModelAndView("adminform", "sesion", sesion);
	}
	
	@RequestMapping("guardarAdministrador")
	public ModelAndView guardarAdministrador(@ModelAttribute Administrador administrador){
		admindao.persistir(administrador);
		return new ModelAndView("redirect:listarUsuarios");
	}
	
	@RequestMapping("crearResponsable")
	public ModelAndView crearResponsable(@ModelAttribute Responsable responsable, HttpSession sesion){
		return new ModelAndView("responsableform", "sesion", sesion);
	}
	
	@RequestMapping("guardarResponsable")
	public ModelAndView guardarResponsable(@ModelAttribute Responsable responsable){
		respodao.persistir(responsable);
		return new ModelAndView("redirect:listarUsuarios");
	}
	
	@RequestMapping("listarUsuarios")
	public ModelAndView listarUsuarios(HttpSession sesion){
		Usuario user= (Usuario) sesion.getAttribute("usuario");
		String admin="A";
		if (!user.getTipo_usuario().equals(admin)){
			return new ModelAndView("index", "sesion", sesion);
		}
		ModelAndView modelAndView= new ModelAndView();
		List<Usuario> listaUsuarios= usuariodao.recuperarUsuarios();
		modelAndView.addObject("usuarios", listaUsuarios);
		modelAndView.addObject("sesion", sesion);
		modelAndView.setViewName("verusuarios");
		return modelAndView;
	}
	
	@RequestMapping("borrarAdmin/{id}")
	public ModelAndView borrarAdmin(@ModelAttribute Administrador administrador){
		admindao.borrar(administrador.getId());
		return new ModelAndView("redirect:/listarUsuarios");
	}
}
