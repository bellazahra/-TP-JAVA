package ma.cigma.TP13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class FrontEndApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(FrontEndApplication.class, args);
		}
		
	@Bean
		
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
		}

	

}
