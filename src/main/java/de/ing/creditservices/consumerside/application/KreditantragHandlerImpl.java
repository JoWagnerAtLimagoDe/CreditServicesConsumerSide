package de.ing.creditservices.consumerside.application;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.ing.creditservices.consumerside.application.events.DBStatusUpdatedEvent;
import de.ing.creditservices.consumerside.application.events.ScoringDoneEvent;
import de.ing.creditservices.consumerside.models.Kreditantrag;
import de.ing.creditservices.consumerside.persistence.KreditantragRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Transactional
public class KreditantragHandlerImpl implements KreditantragHandler {
	
	private final KreditantragRepository kreditantragRepository;
	
	public KreditantragHandlerImpl(final KreditantragRepository kreditantragRepository) {
		this.kreditantragRepository = kreditantragRepository;
	}
	
	@Override
	public void processLoanRequest(Kreditantrag kreditantrag) {
		kreditantragRepository.save(kreditantrag);
		log.info("Kreditantrag fired..." + kreditantrag.getKreditAntragId());
	}
	
	@Override
	public void processCancelLoanRequest(Kreditantrag kreditantrag) {
		log.info("Kredit Storno fired..." + kreditantrag.getKreditAntragId());
	}
	
	@Override
	public void processLoanRequestStatusChange(Kreditantrag kreditantrag) {
		log.info("Kreditantrag status changed fired..." + kreditantrag.getKreditAntragId());
	}
	
	@Override
	public void handle(ScoringDoneEvent event) {
//		log.info("BonitaetStatusUpdatedEvent received..." + event.getEventId());
//		final Kreditantrag kreditantrag = kreditantragRepository.findById(event.getKreditAntragId()).orElseThrow(() -> new RuntimeException("not found"));
//		kreditantrag.setStatusBonitaetCheck(event.getStatusBonitaetCheck());
//		
//		checkStatus(kreditantrag);
	}

//	@Override
//	public void handle(LocationStatusUpdatedEvent event) {
//		log.info("LocationStatusUpdatedEvent received..." + event.getEventId());
//		final Kreditantrag kreditantrag = kreditantragRepository.findById(event.getKreditAntragId()).orElseThrow(() -> new RuntimeException("not found"));
//		kreditantrag.setStatusBonitaetCheck(event.getStatusLocationCheck());
//		
//		checkStatus(kreditantrag);
//	}

	@Override
	public void handle(DBStatusUpdatedEvent event) {
		log.info("DBStatusUpdatedEvent received..." + event.getEventId());
		final Kreditantrag kreditantrag = kreditantragRepository.findById(event.getKreditAntragId()).orElseThrow(() -> new RuntimeException("not found"));
		kreditantrag.setStatusDB(event.getStatusDB());
	}

//	@Override
//	public void handle(GesamtStatusUpdatedEvent event) {
//		log.info("DBStatusUpdatedEvent received..." + event.getEventId());
//		final Kreditantrag kreditantrag = kreditantragRepository.findById(event.getKreditAntragId()).orElseThrow(() -> new RuntimeException("not found"));
//		kreditantrag.setStatusGesamt(event.getStatusGesamt());
//	}
	
	private void checkStatus(Kreditantrag kreditantrag) {
		if(kreditantrag.getStatusGesamt().equals("storniert"))
			return;
		if(kreditantrag.getStatusBonitaetCheck().equals("ok") && kreditantrag.getStatusLocationCheck().equals("ok")) {
			kreditantrag.setStatusGesamt("Genehmigt");
			processLoanRequestStatusChange(kreditantrag);
		}
	}



}
