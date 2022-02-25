package cigma.pfe.presentation;
import cigma.pfe.models.Client;
import cigma.pfe.sirvice.IClientService;


public class ClientController {
	
	private IClientService service ;
	public void setService(IClientService service) {
	this.service = service;
	}
	public void save(Client c){
	service.save(c);
	}
	public void modify(Client c){
	service.modify(c);
	}
	
	public void removeById(long id){
		service.removeById(id);
		}

}
