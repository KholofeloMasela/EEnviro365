package com.enviro.assessment.grad001.kholofeloMasela.controller;

import com.enviro.assessment.grad001.kholofeloMasela.controller.model.PetID;
import com.enviro.assessment.grad001.kholofeloMasela.model.Pet;
import com.enviro.assessment.grad001.kholofeloMasela.repository.PetRepository;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PetController {
    @PostMapping("/pets")
    public ResponseEntity<Pet> createProduct(@RequestBody final Pet pet) {
        System.out.println(pet);
        Pet newPet = pet.save(pet);
        return new ResponseEntity<Pet>(newPet, HttpStatus.CREATED);
    }

}
