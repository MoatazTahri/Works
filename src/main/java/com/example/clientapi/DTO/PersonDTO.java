package com.example.clientapi.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@NoArgsConstructor
@Getter
@Setter
public class PersonDTO {
    private int id;
    private String cin;
    private String name;

    public PersonDTO(String cin, String name) {
        this.cin = cin;
        this.name = name;
    }
}
