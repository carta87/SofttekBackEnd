package com.Softtek.API.domain.service;

import com.Softtek.API.domain.dto.Person;
import com.Softtek.API.domain.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService  {

    @Autowired
    PersonRepository personRepository;

    public List<Person> getAllPerson() {
        return personRepository.getAllPerson();
    }

    public  Optional<Person> getPersonById(int personId) {
        return personRepository.getPersonById(personId);
    }

    public Person savePerson(Person person) {
        return personRepository.savePerson(person);
    }

    public boolean deletePerson(int personId) {
        return getPersonById(personId).map(person -> {
            personRepository.deletePerson(personId);
            return true;
        }).orElse(false);
    }
}
