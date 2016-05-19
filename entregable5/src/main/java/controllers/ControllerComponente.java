package controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import interfazDAO.ComponenteDAO;
import modelo.Componente;
import modelo.Usuario;

@Controller
public class ControllerComponente {
	
	@Autowired
	private ComponenteDAO compodao;
	
	@RequestMapping("agregarComponente")
	public ModelAndView agregarComponente(@ModelAttribute Componente componente, HttpSession sesion){
		return new ModelAndView("componenteform", "sesion", sesion);
	}
	
	@RequestMapping("guardarComponente")
	public ModelAndView guardarComponente(@ModelAttribute Componente componente){
		compodao.persistir(componente);
		return new ModelAndView("redirect:listarComponentes");
	}
	
	@RequestMapping("listarComponentes")
	public ModelAndView listarComponentes(HttpSession sesion){
		Usuario user= (Usuario) sesion.getAttribute("usuario");
		String admin="A";
		if (!user.getTipo_usuario().equals(admin)){
			return new ModelAndView("index", "sesion", sesion);
		}
		ModelAndView modelAndView= new ModelAndView();
		List<Componente> listaCompos = compodao.recuperarComponentes();
		modelAndView.addObject("sesion", sesion);
		modelAndView.addObject("componentes", listaCompos);
		modelAndView.setViewName("verComponentes");
		return modelAndView;
	}
	
	@RequestMapping("modificarComponente")
	public ModelAndView modificarComponente(@ModelAttribute Componente componente, HttpSession sesion){
		return new ModelAndView("componenteform", "sesion", sesion);
	}
	
	@RequestMapping("actualizarComponente")
	public ModelAndView actualizarComponente(@ModelAttribute Componente componente){
		compodao.actualizar(componente);
		return new ModelAndView("redirect:listarComponentes");
	}
	
	@RequestMapping("borrarComponente/{idComponente}")
	public ModelAndView borrarComponente(@ModelAttribute Componente componente){
		compodao.borrar(componente.getIdComponente());
		return new ModelAndView("redirect:/listarComponentes");
	}
}
