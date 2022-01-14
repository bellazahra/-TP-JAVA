package ma.cigma.pfe.dao;

import cigma.pfe.models.Client;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;


public class CLIENTDAOIMPL  implements ICLIENTDAO{
	
	EntityManagerFactory emf=

	Persistence.createEntityManagerFactory("unit_clients");
	EntityManager em=emf.createEntityManager();
	public CLIENTDAOIMPL() {
	}
	@Override
	public Client save(Client c) {
	em.getTransaction().begin();
	em.persist(c);
	em.getTransaction().commit();
	return null;
	}

}
