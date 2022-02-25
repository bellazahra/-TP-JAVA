package cigma.tp;
import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonApplication {
	
	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("spring.xml");
	ClientController ctrl = (ClientController)
			context.getBean("controller");


	Client client = new Client(1,"ALAMI");
	ctrl.save(client);
}
	
}