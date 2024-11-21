package com.helloword.helloWord;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor @NoArgsConstructor
public class Restaurante {

    private int idPlato;
    private String nombreRestaurante;
    private String direccionRestaurante;
    private String numeroRestaurante;
    private String nombrePlato;
    private double precioPlato;
    private String descripcionPlato;

}
