package com.enviro.assessment.grad001.kholofeloMasela.repository;

import com.enviro.assessment.grad001.kholofeloMasela.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {



}
