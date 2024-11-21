package com.helloword.helloWord;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.management.ConstructorParameters;

@Setter @Getter
@AllArgsConstructor
public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;


}