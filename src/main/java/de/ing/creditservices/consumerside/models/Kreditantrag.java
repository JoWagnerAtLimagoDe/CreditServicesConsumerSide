package de.ing.creditservices.consumerside.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tblKreditantraege")
public class Kreditantrag {
	
	@Size(min = 36, max = 36) @NotEmpty  @Id @Column(length = 36, nullable = false) private String kreditAntragId;
	@Size(min = 1, max = 30) @NotEmpty  @Column(length = 30, nullable = false)private String vorname;
	@Size(min = 1, max = 30) @NotEmpty   @Column(length = 30, nullable = false)String nachname;
	@Size(min = 1, max = 30) @NotEmpty  @Column(length = 30, nullable = false)private String ort;
    @NonNull  @Column(nullable = false) private LocalDateTime antragsdatum;
	@Min(value = 0) @Column(nullable = false) private double summeEinnahmen;
	@Min(value = 0) @Column(nullable = false) private double summeAusgaben;
	@Min(value = 0) @Column(nullable = false) private double kreditsumme;
	@Column(length = 30, nullable = false) @Builder.Default private String statusBonitaetCheck = "in progress";
	@Column(length = 30, nullable = false) @Builder.Default private String statusLocationCheck = "in progress";
	@Column(length = 30, nullable = false) @Builder.Default private String statusDB = "in progress";
	@Column(length = 30, nullable = false) @Builder.Default private String statusGesamt = "in progress";
	
	
}
