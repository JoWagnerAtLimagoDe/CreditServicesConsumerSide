package de.ing.creditservices.consumerside.application.events;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BaseEvent implements Serializable{

	
	private static final long serialVersionUID = 1069121335073007169L;
	@Builder.Default private String eventId = UUID.randomUUID().toString();
	@Builder.Default private LocalDate createDate = LocalDate.now();
	
}
