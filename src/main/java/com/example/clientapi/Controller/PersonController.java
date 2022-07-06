package com.example.clientapi.Controller;

import com.example.clientapi.DTO.PersonDTO;
import com.example.clientapi.Model.Person;
import com.example.clientapi.Repository.PersonRepository;
import com.example.clientapi.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PersonController {
    @Autowired
    PersonService personService;
    @Autowired
    PersonRepository personRepository;

    @GetMapping("/persons")
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }
    @GetMapping("/person")
    public Person getPerson(@RequestParam int id){
        return personService.getPersontById(id);
    }
    @PutMapping("/person/update")
    public Person updatePerson(@RequestBody PersonDTO personDTO){
        return personService.updatePerson(personDTO);
    }
    @DeleteMapping("/person/delete")
    public String deletePerson(@RequestParam int id){
        personService.deletePersonById(id);
        return "Person deleted, id "+id;
    }
    @PostMapping("/person/add")
    public String addPerson(@RequestBody PersonDTO personDTO){
        personService.addPerson(personDTO);
        return "Person injected "+personDTO.getName();
    }
}
