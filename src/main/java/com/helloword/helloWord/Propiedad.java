package com.helloword.helloWord;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Propiedad {

    private Long id_propiedad;
    private String tipo_propiedad;
    private String direccion_propiedad;
    private Double metros_cuadrados;
    private Double valor_alquiler;
}
