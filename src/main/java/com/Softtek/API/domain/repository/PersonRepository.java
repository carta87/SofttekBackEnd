package com.Softtek.API.domain.repository;

import com.Softtek.API.domain.dto.Person;

import java.util.List;
import java.util.Optional;

public interface PersonRepository {

    List<Person> getAllPerson();
    Optional<Person> getPersonById(int personId);
    //Optional<Person> registerPerson(Person person);
    Person savePerson(Person person);
    void deletePerson(int personId);
}
