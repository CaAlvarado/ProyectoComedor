package controllers;

import interfazDAO.AdministradorDAO;
import interfazDAO.PersonaDAO;
import interfazDAO.ResponsableDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import modelo.Administrador;
import modelo.Persona;
import modelo.Responsable;
import modelo.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerPrincipal {
	
	@Autowired 
	private AdministradorDAO admindao;
	
	@Autowired 
	private ResponsableDAO responsabledao;
	
	@Autowired 
	private PersonaDAO personadao;
	
	@RequestMapping("index")
	public ModelAndView principal(HttpServletRequest request){
		HttpSession sesion= request.getSession(false);
		return new ModelAndView("index", "sesion", sesion);
	}

	@RequestMapping("login")
	public ModelAndView sesion(){
		Usuario usuario= new Usuario();
		return new ModelAndView("login", "usuario", usuario);
	}
	
	@RequestMapping("salir")
	public ModelAndView salir(HttpServletRequest request){
		HttpSession sesion= request.getSession(false);
		sesion.invalidate();
		return new ModelAndView("redirect:index");
	}
	
	@RequestMapping("perfil")
	public ModelAndView perfil(HttpSession sesion){
		Usuario user= (Usuario) sesion.getAttribute("usuario");
		String pagina="index";
		String admin="A";
		String respo="R";
		String perso="P";
		if (user.getTipo_usuario().equals(admin)){
			pagina="menuadmin";
		}
		if (user.getTipo_usuario().equals(respo)){
			pagina="menuresponsable";
		}
		if (user.getTipo_usuario().equals(perso)){
			pagina="menuusuario";
		}
		return new ModelAndView(pagina, "sesion", sesion);
	}
	
	@RequestMapping("entrar")
	public ModelAndView entrar(@ModelAttribute Usuario usuario, HttpServletRequest request){
		String mensaje= "Hubo un error al iniciar sesion, verifique que haya ingresado bien el dni y la contraseña";
		Responsable respon= responsabledao.recuperarResponsable(usuario.getDni());
		Persona persona= personadao.recuperarPersona(usuario.getDni());
		Administrador admin= admindao.recuperarAdministrador(usuario.getDni());
		HttpSession sesion= request.getSession(false);
		String pagina="index";
		if ((respon==null) && (persona==null) && (admin==null)){
			return new ModelAndView("login", "mensaje", mensaje);
		}
		if (respon!=null){
			if(usuario.getPass().equals(respon.getPass())){
				sesion.setAttribute("user", respon.getUser());
				sesion.setAttribute("usuario", respon);
				pagina="menuresponsable";
			}
		}
		if(admin!=null){
			if(usuario.getPass().equals(admin.getPass())){
				sesion.setAttribute("user", admin.getUser());
				sesion.setAttribute("usuario", admin);
				pagina="menuadmin";
			}
		}
		if(persona!=null){
			if(usuario.getPass().equals(persona.getPass())){
				sesion.setAttribute("user", persona.getUser());
				sesion.setAttribute("usuario", persona);
				pagina="menuusuario";
			}
		}
		return new ModelAndView(pagina, "sesion", sesion);
	}
}
