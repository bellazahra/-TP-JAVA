package ma.cigma.pfe.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cigma.pfe.models.Client;

@Repository

public interface ICLIENTDAO extends CrudRepository<Client,Long> {

	
}
