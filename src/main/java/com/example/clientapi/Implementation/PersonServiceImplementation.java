package com.example.clientapi.Implementation;

import com.example.clientapi.DTO.PersonDTO;
import com.example.clientapi.Exception.PersonNotFoundException;
import com.example.clientapi.Model.Person;
import com.example.clientapi.Repository.PersonRepository;
import com.example.clientapi.Service.PersonService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImplementation implements PersonService {
    @Autowired
    PersonRepository personRepository;
    @Override
    public Person getPersontById(int id) {
        return personRepository.findPersonById(id);
    }

    @Override
    public void addPerson(PersonDTO personDTO) {
        Person person=new Person(personDTO.getCin(),personDTO.getName());
        personRepository.save(person);
    }

    @SneakyThrows
    @Override
    public void deletePersonById(int id) {
        Person person=personRepository.findById(id)
                        .orElseThrow(()->new PersonNotFoundException("No person found!"));
        personRepository.delete(person);
    }

    @SneakyThrows
    @Override
    public Person updatePerson(PersonDTO personDTO) {
        Person person=personRepository.findById(personDTO.getId())
                .orElseThrow(()->new PersonNotFoundException("No person found!"));
        person.setCin(personDTO.getCin());
        person.setName(personDTO.getName());
        return personRepository.save(person);
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
