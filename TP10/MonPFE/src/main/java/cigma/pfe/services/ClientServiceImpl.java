package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.repositories.ClientRepositoryImpl;
import ma.cigma.pfe.dao.ICLIENTDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ClientServiceImpl  implements ClientService{
	@Autowired
	private ICLIENTDAO dao;
	
	public ClientServiceImpl() {
		
	  System.out.println("creation bean service");
	}
	
	@Override
	public void save(Client c) {
		
	   dao.save(c);
	}

	
	
}
