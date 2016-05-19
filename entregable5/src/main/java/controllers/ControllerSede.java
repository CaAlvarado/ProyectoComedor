package controllers;

import java.util.List;

import interfazDAO.SedeDAO;

import javax.servlet.http.HttpSession;

import modelo.Sede;
import modelo.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ControllerSede {

	@Autowired
	private SedeDAO sededao;
	
	@RequestMapping("agregarSede")
	public ModelAndView agregarSede(@ModelAttribute Sede sede, HttpSession sesion){
		return new ModelAndView("sedeform", "sesion", sesion);
	}
	
	@RequestMapping("guardarSede")
	public ModelAndView guardarSede(@ModelAttribute Sede sede){
		sededao.persistir(sede);
		return new ModelAndView("redirect:listarSedes");
	}
	
	@RequestMapping("listarSedes")
	public ModelAndView listarSedes(HttpSession sesion){
		Usuario user= (Usuario) sesion.getAttribute("usuario");
		String admin="A";
		if (!user.getTipo_usuario().equals(admin)){
			return new ModelAndView("index", "sesion", sesion);
		}
		ModelAndView modelAndView= new ModelAndView();
		List<Sede> listaSedes= sededao.recuperarSedes();
		modelAndView.addObject("sesion", sesion);
		modelAndView.addObject("sedes", listaSedes);
		modelAndView.setViewName("versedes");
		return modelAndView;
	}
	
	@RequestMapping("borrarSede/{idSede}")
	public ModelAndView borrarSede(@ModelAttribute Sede sede){
		sededao.borrar(sede.getIdSede());
		return new ModelAndView("redirect:/listarSedes");
	}
}
