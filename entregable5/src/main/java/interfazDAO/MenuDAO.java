package interfazDAO;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import modelo.Menu;

@Component
public interface MenuDAO {

	public Menu persistir(Menu menu);
	public List<Menu> recuperarMenus();
	public Menu actualizar(Menu menu);
	public void borrar(Serializable id);
}
