package com.Softtek.API.persistence.crud;

import com.Softtek.API.persistence.entity.Persona;
import org.springframework.data.repository.CrudRepository;


public interface CrudPersonRepository extends CrudRepository<Persona, Integer> {
}
