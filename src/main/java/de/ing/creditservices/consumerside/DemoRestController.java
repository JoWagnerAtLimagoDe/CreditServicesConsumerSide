package de.ing.creditservices.consumerside;

import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.ing.creditservices.consumerside.application.events.CreditApplicationEnteredEvent;
import de.ing.creditservices.consumerside.models.Kreditantrag;

@RestController
@RequestMapping("/demo")
public class DemoRestController {

	@GetMapping(path = "/event", produces = MediaType.APPLICATION_JSON_VALUE)
	public CreditApplicationEnteredEvent getDemoEnteredEvent() {
		
		Kreditantrag antrag = Kreditantrag.builder().kreditAntragId(UUID.randomUUID().toString())
				.nachname("Mustermann")
				.vorname("Max")
				.summeEinnahmen(100)
				.summeAusgaben(90)
				.kreditsumme(10)
				.build();
		
		return CreditApplicationEnteredEvent
				.builder()
				.kreditantrag(antrag)
				.build();
	}
}
