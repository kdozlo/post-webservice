package webstudy.postwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PostWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostWebServiceApplication.class, args);
	}

}
