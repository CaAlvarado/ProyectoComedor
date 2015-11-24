package implementacionDAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {
	private static final EntityManagerFactory emf= Persistence.createEntityManagerFactory("comedor");

	public static EntityManagerFactory getEmf() {
		return emf;
	}
}
