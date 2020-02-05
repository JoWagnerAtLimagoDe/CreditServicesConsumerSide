package de.ing.creditservices.consumerside.application.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface ApplicationProcessChannels {
	String CREDIT_APPLICATION_ENTERED = "creditApplicationEnteredIn";
	String DB_STORED = "dbStoredIn";
	String SCORING_POSITIVE = "scoringPositiveIn";
	String SCORING_NEGATIVE = "scoringNegativeIn";
	String CREDIT_APPLICATION_DECLINED = "creditApplicationDeclinedIn";

	@Output
	MessageChannel creditApplicationRequestGeneratedOut();

	@Input
	SubscribableChannel creditApplicationEnteredIn();

	@Input
	SubscribableChannel creditApplicationDeclinedIn();

	@Input
	SubscribableChannel dbStoredIn();

	@Input
	SubscribableChannel scoringPositiveIn();

	@Input
	SubscribableChannel scoringNegativeIn();
}
