package com.example.clientapi.Repository;

import com.example.clientapi.DTO.PersonDTO;
import com.example.clientapi.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
    Person findPersonById(int id);
}
