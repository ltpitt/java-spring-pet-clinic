package it.davidenastri.petclinic.services;

import it.davidenastri.petclinic.model.Pet;
import org.springframework.stereotype.Service;

@Service
public interface PetService extends CrudService<Pet, Long> {

}
