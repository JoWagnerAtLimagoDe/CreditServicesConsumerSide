package de.ing.creditservices.consumerside.persistence;

import org.springframework.data.repository.CrudRepository;

import de.ing.creditservices.consumerside.models.Kreditantrag;

public interface KreditantragRepository extends CrudRepository<Kreditantrag, String> {

}
