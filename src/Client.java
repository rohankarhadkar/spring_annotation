import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.service.CustomerService;

public class Client {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		CustomerService as = appContext.getBean("audiService", com.service.AudiService.class);
		System.out.println(as.findAllCars());

		CustomerService ss = appContext.getBean("skodaService", com.service.SkodaService.class);
		System.out.println(ss.findAllCars());

		CustomerService ls = appContext.getBean("lamborghiniService", com.service.LamborghiniService.class);
		System.out.println(ls.findAllCars());

		CustomerService hs = appContext.getBean("hondaService", com.service.HondaService.class);
		System.out.println(hs.findAllCars());
	}

}
