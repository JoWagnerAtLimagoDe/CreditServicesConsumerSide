package de.ing.creditservices.consumerside.application.events;

import de.ing.creditservices.consumerside.models.Kreditantrag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class CreditApplicationEnteredEvent extends BaseEvent {

	private static final long serialVersionUID = 442876308858072764L;
	private Kreditantrag kreditantrag;
}
