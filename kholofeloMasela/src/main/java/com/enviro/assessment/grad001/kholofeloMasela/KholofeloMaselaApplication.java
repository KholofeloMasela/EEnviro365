package com.enviro.assessment.grad001.kholofeloMasela;

import com.enviro.assessment.grad001.kholofeloMasela.model.Pet;
import com.enviro.assessment.grad001.kholofeloMasela.repository.PetRepository;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KholofeloMaselaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KholofeloMaselaApplication.class, args);
//		PetRepository petRepository =
//				configurableApplicationContext.getBean(PetRepository.class);
//		Pet pet = new Pet("Cat", "Tom");
//		petRepository.save(pet);
	}

}
