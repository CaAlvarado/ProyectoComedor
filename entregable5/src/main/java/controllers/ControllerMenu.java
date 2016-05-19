package controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import interfazDAO.MenuDAO;
import modelo.Menu;
import modelo.Usuario;

@Controller
public class ControllerMenu {

	@Autowired
	private MenuDAO menudao;
	
	@RequestMapping("agregarMenu")
	public ModelAndView agregarMenu(@ModelAttribute Menu menu, HttpSession sesion){
		return new ModelAndView("menuform", "sesion", sesion);
	}
	
	@RequestMapping("guardarMenu")
	public ModelAndView guardarMenu(@ModelAttribute Menu menu){
		menudao.persistir(menu);
		return new ModelAndView("redirect:listarMenus");
	}
	
	@RequestMapping("listarMenus")
	public ModelAndView listarMenus(HttpSession sesion){
		Usuario user= (Usuario) sesion.getAttribute("usuario");
		String admin="A";
		if (!user.getTipo_usuario().equals(admin)){
			return new ModelAndView("index", "sesion", sesion);
		}
		ModelAndView modelAndView= new ModelAndView();
		List<Menu> listaMenus = menudao.recuperarMenus();
		modelAndView.addObject("sesion", sesion);
		modelAndView.addObject("componentes", listaMenus);
		modelAndView.setViewName("verMenus");
		return modelAndView;
	}
	
	@RequestMapping("modificarMenu")
	public ModelAndView modificarMenu(@ModelAttribute Menu menu, HttpSession sesion){
		return new ModelAndView("menuform", "sesion", sesion);
	}
	
	@RequestMapping("actualizarMenu")
	public ModelAndView actualizarComponente(@ModelAttribute Menu menu){
		menudao.actualizar(menu);
		return new ModelAndView("redirect:listarMenus");
	}
	
	@RequestMapping("borrarMenu/{idMenu}")
	public ModelAndView borrarMenu(@ModelAttribute Menu menu){
		menudao.borrar(menu.getIdMenu());
		return new ModelAndView("redirect:/listarMenus");
	}
}
