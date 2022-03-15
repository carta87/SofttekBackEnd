package com.Softtek.API.web.controller;

import com.Softtek.API.domain.dto.Person;
import com.Softtek.API.domain.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/saludar")
    private String Prueba(){
        return "hola proyecto";
    }

    @GetMapping("/todos")
    private ResponseEntity<List<Person>> getAll(){
        return new ResponseEntity<>(personService.getAllPerson(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity <Person> getPerson(@PathVariable("id") int personId){
        return personService.getPersonById(personId)
                .map(person ->new  ResponseEntity<>(person, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Person> save(@RequestBody Person person){
        return new ResponseEntity<>(personService.savePerson(person), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int personId){
        if(personService.deletePerson(personId)){
            return new ResponseEntity(HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }


}
