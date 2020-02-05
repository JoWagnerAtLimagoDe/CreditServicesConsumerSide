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
public class DBStatusUpdatedEvent extends BaseEvent{
	
	private static final long serialVersionUID = 432279251996960561L;
	private String kreditAntragId;
	private String statusDB;

}
