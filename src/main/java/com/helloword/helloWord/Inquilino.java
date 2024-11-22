package com.helloword.helloWord;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Inquilino {
    private Long id_inquilino;
    private String dni;
    private String nombre;
    private String apellido;
    private String profesion;
}
