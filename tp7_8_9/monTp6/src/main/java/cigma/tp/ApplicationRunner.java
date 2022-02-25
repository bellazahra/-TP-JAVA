package cigma.tp;

import cigma.pfe.models.Client;
import cigma.pfe.controllers.ClientController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		ClientController ctr= (ClientController) ctx.getBean("ctrl1");
		Client client = new Client("OMAR");
		CarteFidelio carteFidelio = new CarteFidelio("A29930489");
		carteFidelio.setClient(client);
		client.setCarteFidelio(carteFidelio);
		ctr.save(client);
	}


}
