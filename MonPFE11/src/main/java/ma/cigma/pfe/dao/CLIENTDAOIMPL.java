package ma.cigma.pfe.dao;
import cigma.pfe.models.Client;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Repository
public  class CLIENTDAOIMPL  implements ICLIENTDAO{
	
	@PersistenceContext
	private EntityManager entitymanager;

	@Override
	public void save(Client c) {
		
	entitymanager.persist(c);
	}
	
	
	
	public CLIENTDAOIMPL() {
		
	System.out.println("creation bean dao");
	}

	

}
