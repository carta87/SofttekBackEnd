package com.Softtek.API.persistence.mapper;
import com.Softtek.API.domain.dto.Person;
import com.Softtek.API.persistence.entity.Persona;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;

@Mapper (componentModel = "spring")
public interface PersonaMapper {

    @Mappings({
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellido", target = "lastName"),
            @Mapping(source = "empleado", target = "employee")
    })
    Person toPerson(Persona persona);
    List<Person> toListPersons(List<Persona> personas);

    @InheritInverseConfiguration
    Persona toPersona(Person person);
}
