package jnet.agreement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("jnet.agreement")
public class DigitalAgreementsServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalAgreementsServerApplication.class, args);
	}

}
