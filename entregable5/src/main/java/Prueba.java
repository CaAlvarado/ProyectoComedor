import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import implementacionDAO.*;
import modelo.*;

import java.util.Calendar;

public class Prueba {

	public static void main(String[] args) {
		
		Sede sede= new Sede();
		SedeDAOHibernateJPA sededao= DAOFactory.getSedeDAOHibernateJPA();
		sededao.persistir(sede);
		sede.setDireccion("50 y 116");
		sede.setNombre("Sede Bosque Oeste");
		sede= sededao.actualizar(sede);
		
		Administrador administrador= new Administrador();
		AdministradorDAOHibernateJPA admindao= DAOFactory.getAdministradorDAOHibernateJPA();
		admindao.persistir(administrador);
		administrador.setApellido("Alvarado");
		administrador.setNombre("Cristian");
		administrador.setDni(37845443);
		administrador.setDireccion("Villa Elvira");
		administrador.setUser("admin");
		administrador.setPass("admin");
		administrador=admindao.actualizar(administrador);
		
		Responsable resp=new Responsable();
		ResponsableDAOHibernateJPA respdao= DAOFactory.getResponsableDAOHibernateJPA();
		respdao.persistir(resp);
		resp.setApellido("Castro");
		resp.setNombre("Franco");
		resp.setDni(33236388);
		resp.setDireccion("Casco Urbano");
		resp.setUser("usuarioresp1");
		resp.setPass("resp1pass");
		resp=respdao.actualizar(resp);
		
		UsuarioDAOHibernateJPA usuariodao= DAOFactory.getUsuarioDAOHibernateJPA();
		ArrayList<Usuario> lista= (ArrayList<Usuario>) usuariodao.recuperarTodos("apellido");
		for (Usuario u: lista){
			System.out.println(u.getApellido());
			System.out.println(u.getNombre());
		}
		
		resp.setActivo(false);
		resp=respdao.actualizar(resp);
		
		
		Componente compo= new Componente();
		ComponenteDAOHibernateJPA compodao= DAOFactory.getComponenteDAOHibernateJPA();
		compodao.persistir(compo);
		compo.setNombre("Pollo con papas");
		compo.setAptoCeliaco(false);
		compo.setAptoDiabetico(true);
		compo.setAptoHipertenso(false);
		compo.setAptoLactosa(true);
		compodao.actualizar(compo);
		
		administrador.setActivo(false);
		
		Menu menu= new Menu();
		MenuDAOHibernateJPA menudao= DAOFactory.getMenuDAOHibernateJPA();
		menu.setAptoCeliaco(compo.isAptoCeliaco());
		menu.setPrecioMenu(11.00);
		menu.setDia("lunes");
		menu.setVegetariano(false);
		menudao.persistir(menu);
		menu.setNombre("Menu de pollo con papas");
		menu=menudao.actualizar(menu);
		
		Cartilla cartilla= new Cartilla();
		CartillaDAOHibernateJPA cartilladao= DAOFactory.getCartillaDAOHibernateJPA();
		cartilla.setSede(sede);
		cartilladao.persistir(cartilla);
		cartilla.setNombre("Cartilla 1");
		Calendar fecha= Calendar.getInstance();
		fecha.set(2015, 12, 01);
		cartilla.setFechaInit(fecha);
		fecha.set(2015, 12, 05);
		cartilla.setFechaFin(fecha);
		List<Menu> listamenus= new LinkedList<Menu>();
		listamenus.add(menu);
		cartilla.setLunes(listamenus);
		cartilla=cartilladao.actualizar(cartilla);
		
	}

}
