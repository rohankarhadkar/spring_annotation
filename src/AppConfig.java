import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.repository.AudiRepository;
import com.repository.CarsRepository;
import com.repository.LamborghiniRepository;
import com.repository.SkodaRepository;
import com.service.AudiService;
import com.service.CustomerService;
import com.service.HondaService;
import com.service.LamborghiniService;
import com.service.SkodaService;

@Configuration
@ComponentScan({ "com" })
public class AppConfig {

	// Using setter injection
	@Bean(name = "audiService")
	public CustomerService getAudiService() {
		AudiService as = new AudiService();
		as.setRepo(getAudiRepository());
		return as;
	}

	@Bean(name = "audiRepository")
	public CarsRepository getAudiRepository() {
		return new AudiRepository();
	}

	// Using constructor injection
	@Bean(name = "skodaService")
	public CustomerService getSkodaService() {
		return new SkodaService(getSkodaRepository());
	}

	@Bean(name = "skodaRepository")
	public CarsRepository getSkodaRepository() {
		return new SkodaRepository();
	}

	// Using autowired using member variable injection that uses reflection
	@Bean(name = "lamborghiniService")
	public CustomerService getLamborghiniService() {
		return new LamborghiniService();
	}

	@Bean(name = "lamborghiniRepository")
	public CarsRepository getLamborghiniRepository() {
		return new LamborghiniRepository();
	}

	// Using setter injection and component scan for repository bean
	@Bean(name = "hondaService")
	public CustomerService getHondaService() {
		return new HondaService();
	}
}
