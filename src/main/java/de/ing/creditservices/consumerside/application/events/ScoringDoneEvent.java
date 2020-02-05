package de.ing.creditservices.consumerside.application.events;

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
public class ScoringDoneEvent extends BaseEvent{

	
	private static final long serialVersionUID = -7397656247944037292L;
	private String kreditAntragId;
	
	

}
