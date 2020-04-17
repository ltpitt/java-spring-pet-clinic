package it.davidenastri.petclinic.services;

import it.davidenastri.petclinic.model.Vet;
import org.springframework.stereotype.Service;

@Service
public interface VetService extends CrudService<Vet, Long> {

}
