package ma.cigma.pfe.dao;
import cigma.pfe.models.Client;

public interface ICLIENTDAO {
  void save(Client c);
   Client update(Client c);
   void deleteById(long idClient);
   Client findById(long idClient);
   
   
   
   
}
