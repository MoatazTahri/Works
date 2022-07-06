package com.example.clientapi.Service;

import com.example.clientapi.DTO.PersonDTO;
import com.example.clientapi.Model.Person;

import java.util.List;

public interface PersonService {
    Person getPersontById(int id);
    void addPerson(PersonDTO personDTO);
    void deletePersonById(int id);
    Person updatePerson(PersonDTO personDTO);
    List<Person> getAllPersons();
}
