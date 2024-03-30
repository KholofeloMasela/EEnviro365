package com.enviro.assessment.grad001.kholofeloMasela.model;


import com.enviro.assessment.grad001.kholofeloMasela.repository.PetRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Table(name = "Pet")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    @Column(name= "pet_type")
    private final String petType;
    @Column(name = "pet_name")
    private final String petName;

    @Autowired
    PetRepository repo;

    public Pet(String petType, String petName) {
        this.petType = petType;
        this.petName = petName;
    }

    public Long getId() {
        return id;
    }

    public String getPetType() {
        return petType;
    }

    public String getPetName() {
        return petName;
    }

    public Pet save(Pet pet){
        return repo.save(pet);
    }


}
