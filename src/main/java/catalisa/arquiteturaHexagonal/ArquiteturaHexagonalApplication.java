package catalisa.arquiteturaHexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "catalisa.arquiteturaHexagonal")
@ComponentScan("catalisa.arquiteturaHexagonal")
public class ArquiteturaHexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArquiteturaHexagonalApplication.class, args);
	}

}
