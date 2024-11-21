package com.helloword.helloWord;


import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class paciente {

    private int pacienteId;
    private long pacienteDni;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
}
