package cigma.pfe.sirvice;

import cigma.pfe.dao.IClientDao;
import cigma.pfe.models.Client;

public class ClientServiceImpl  implements IClientService{
	
	private IClientDao dao;
	
	public void setDao(IClientDao dao) {
	this.dao = dao;
	}
	
	
	
	public Client save(Client c) {
	return dao.save(c);
	}
	
	

	
	public Client modify(Client c) {
	return dao.update(c);
	}
	
	@Override
	public void removeById(long id) {
	dao.deleteById(id);
	}


}
