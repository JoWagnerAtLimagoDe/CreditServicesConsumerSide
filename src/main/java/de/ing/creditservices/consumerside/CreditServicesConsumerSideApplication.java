package de.ing.creditservices.consumerside;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import de.ing.creditservices.consumerside.application.messaging.ApplicationProcessChannels;

@SpringBootApplication
@EnableBinding(ApplicationProcessChannels.class)
public class CreditServicesConsumerSideApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditServicesConsumerSideApplication.class, args);
	}

}
