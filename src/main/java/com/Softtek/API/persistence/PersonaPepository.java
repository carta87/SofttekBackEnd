package com.Softtek.API.persistence;
import com.Softtek.API.domain.dto.Person;
import com.Softtek.API.domain.repository.PersonRepository;
import com.Softtek.API.persistence.crud.CrudPersonRepository;
import com.Softtek.API.persistence.entity.Persona;
import com.Softtek.API.persistence.mapper.PersonaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class PersonaPepository implements PersonRepository {

    @Autowired
    private CrudPersonRepository crudPersonRepository;

    @Autowired
    private PersonaMapper personaMapper;

    @Override
    public List<Person> getAllPerson() {
        List<Persona> personas =(List<Persona>) crudPersonRepository.findAll();
        return personaMapper.toListPersons(personas);
    }

    @Override
    public Optional<Person> getPersonById(int personId) {
        return  crudPersonRepository.findById(personId).map(persona -> personaMapper.toPerson(persona));
    }

    @Override
    public Person savePerson(Person person) {
        Persona persona= personaMapper.toPersona(person);
        return personaMapper.toPerson(crudPersonRepository.save(persona));
    }

    @Override
    public void deletePerson(int personId) {
        crudPersonRepository.deleteById(personId);

    }
}
