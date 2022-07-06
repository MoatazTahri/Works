package com.example.clientapi.Exception;

import com.example.clientapi.Model.Person;

public class PersonNotFoundException extends Exception {
    public PersonNotFoundException(String message){
        super(message);
    }
}
