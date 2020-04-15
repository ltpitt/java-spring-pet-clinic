package it.davidenastri.petclinic.services;

import it.davidenastri.petclinic.model.Vet;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
