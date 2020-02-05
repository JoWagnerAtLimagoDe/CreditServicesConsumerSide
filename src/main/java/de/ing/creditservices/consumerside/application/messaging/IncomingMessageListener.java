package de.ing.creditservices.consumerside.application.messaging;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import de.ing.creditservices.consumerside.application.events.CreditApplicationEnteredEvent;
import de.ing.creditservices.consumerside.application.events.ScoringDoneEvent;



@Component
public class IncomingMessageListener {
	

	


	@StreamListener(ApplicationProcessChannels.CREDIT_APPLICATION_ENTERED)
	public void receiveBonitaetStatusUpdatedEvent(@Payload CreditApplicationEnteredEvent creditApplicationEnteredEvent) {
		
	}


//	@StreamListener(ApplicationProcessChannels.DB_STORED)
//	public void receiveCustomerCreatedEvent(@Payload CustomerCreatedEvent customerCreatedEvent) {
//		
//	}

	@StreamListener(ApplicationProcessChannels.SCORING_NEGATIVE)
	public void receiveScoringNegativeEvent(@Payload ScoringDoneEvent scoringDoneEvent) {
		
	}

	@StreamListener(ApplicationProcessChannels.SCORING_POSITIVE)
	public void receiveScoringPositiveEvent(@Payload ScoringDoneEvent scoringDoneEvent) {
		
	}

//	@StreamListener(ApplicationProcessChannels.CREDIT_APPLICATION_DECLINED)
//	public void processDeclinedApplication(ApplicationDeclinedEvent event) {
//		
//	}
}
