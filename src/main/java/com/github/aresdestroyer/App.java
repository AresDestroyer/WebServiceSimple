package com.github.aresdestroyer;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.aresdestroyer.domain.Person;
import com.github.aresdestroyer.repository.PersonRepository;

@SpringBootApplication
public class App implements CommandLineRunner {

    public static void main(String[] args) {
	SpringApplication.run(App.class, args);
    }

    @Autowired
    private PersonRepository personRepository;

    @Transactional(rollbackOn = IllegalStateException.class)
    @Override
    public void run(String... args) throws Exception {
	long reward = 700000000L;
//	Person person = new Person();
//	person.setName("Ace");
//	person.setReward(reward);
//	person.setAlive(false);
//	personRepository.save(person);

//	System.out.println(personRepository.findPersonL());

//	Person nami = personRepository.findById(2L).get();
//	nami.setAlive(false);
//	personRepository.save(nami);

	String tripulacion = "Sombrero de paja";

	Person luffy = personRepository.findById(1L).get();
	luffy.setTripulacion(tripulacion);
	personRepository.save(luffy);

	Person nami = personRepository.findById(3L).get();
	nami.setTripulacion(tripulacion);
	personRepository.save(nami);

//	throw new IllegalStateException("Rollback");

//	personRepository.deleteAllDead();
    }

}