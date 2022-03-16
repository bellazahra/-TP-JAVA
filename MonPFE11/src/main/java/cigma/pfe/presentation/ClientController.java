package cigma.pfe.presentation;

import cigma.pfe.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import cigma.pfe.services.ClientService;
import java.util.List;



@Controller(value = "ctrl1")
public class ClientController {


	@Autowired
	private ClientService service;
	
	public Client save(Client clt) {
	
		return service.save(clt);
	}
	public Client modify(Client clt) {
	
		return service.modify(clt);
	}
	public void remove(long idClt) {
	
		service.remove(idClt);
	}
	public Client getOne(long idClt) {
	
		return service.getOne(idClt);
	}
	public List<Client> getAll() {
	
		return service.getAll();
	}
}
