package in.saurabhit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.saurabhit.service.AccountService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		AccountService service = context.getBean(AccountService.class);
		
		service.saveAccData();
		service.getDataUsingPk();
		
		context.close();
	}

}
