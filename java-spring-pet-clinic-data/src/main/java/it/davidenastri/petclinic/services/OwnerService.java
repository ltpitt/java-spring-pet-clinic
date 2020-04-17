package it.davidenastri.petclinic.services;

import it.davidenastri.petclinic.model.Owner;
import org.springframework.stereotype.Service;

@Service
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
