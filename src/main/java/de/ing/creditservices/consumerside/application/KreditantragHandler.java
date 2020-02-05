package de.ing.creditservices.consumerside.application;

import de.ing.creditservices.consumerside.application.events.DBStatusUpdatedEvent;
import de.ing.creditservices.consumerside.application.events.ScoringDoneEvent;
import de.ing.creditservices.consumerside.models.Kreditantrag;

public interface KreditantragHandler {

	void processLoanRequest(Kreditantrag kreditantrag);

	void processCancelLoanRequest(Kreditantrag kreditantrag);

	void handle(ScoringDoneEvent event);

//	void handle(LocationStatusUpdatedEvent event);

	void handle(DBStatusUpdatedEvent event);

//	void handle(GesamtStatusUpdatedEvent event);

	void processLoanRequestStatusChange(Kreditantrag kreditantrag);

}