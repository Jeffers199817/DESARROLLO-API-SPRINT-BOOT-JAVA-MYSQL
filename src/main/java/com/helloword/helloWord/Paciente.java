package com.helloword.helloWord;


import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Paciente {

    private Long pacienteId;
    private String pacienteDni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
}
