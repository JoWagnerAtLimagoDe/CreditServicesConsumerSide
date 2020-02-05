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
public class ApplicationCanceledEvent extends BaseEvent{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8137522593489421324L;
	private String kreditAntragId;
}
