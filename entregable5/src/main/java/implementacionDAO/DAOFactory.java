package implementacionDAO;

public class DAOFactory {
	
	public static PersonaDAOHibernateJPA getPersonaDAOHibernateJPA(){
		return new PersonaDAOHibernateJPA();
	}
	
	public static FacultadDAOHibernateJPA getFacultadDAOHibernateJPA(){
		return new FacultadDAOHibernateJPA();
	}
	
	public static UsuarioDAOHibernateJPA getUsuarioDAOHibernateJPA(){
		return new UsuarioDAOHibernateJPA();
	}
	
	public static SugerenciaDAOHibernateJPA getSugerenciaDAOHibernateJPA(){
		return new SugerenciaDAOHibernateJPA();
	}
	
	public static AdministradorDAOHibernateJPA getAdministradorDAOHibernateJPA(){
		return new AdministradorDAOHibernateJPA();
	}
	
	public static ResponsableDAOHibernateJPA getResponsableDAOHibernateJPA(){
		return new ResponsableDAOHibernateJPA();
	}
	
	public static ComponenteDAOHibernateJPA getComponenteDAOHibernateJPA(){
		return new ComponenteDAOHibernateJPA();
	}
	
	public static MenuDAOHibernateJPA getMenuDAOHibernateJPA(){
		return new MenuDAOHibernateJPA();
	}
	
	public static CartillaDAOHibernateJPA getCartillaDAOHibernateJPA(){
		return new CartillaDAOHibernateJPA();
	}
	
	public static SedeDAOHibernateJPA getSedeDAOHibernateJPA(){
		return new SedeDAOHibernateJPA();
	}
	
	public static PagoDAOHibernateJPA getPagoDAOHibernateJPA(){
		return new PagoDAOHibernateJPA();
	}
	
	public static SemanaCompraDAOHibernateJPA getSemanaCompraDAOHibernateJPA(){
		return new SemanaCompraDAOHibernateJPA();
	}
	
	public static CompraDAOHibernateJPA getCompraDAOHibernateJPA(){
		return new CompraDAOHibernateJPA();
	}
}
