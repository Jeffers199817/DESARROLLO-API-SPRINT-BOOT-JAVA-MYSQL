package com.helloword.helloWord.controller;


import com.helloword.helloWord.paciente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/odontologo")
public class ControllerOdontologo {


    @GetMapping("/traer/pacientes/{odontologo}")
    public String traerPaciente(@PathVariable String odontologo) throws ParseException {

        List<paciente> listaPaciente = new ArrayList<paciente>();
        String paciente = null;

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

           listaPaciente.add(new paciente(1, 1456156445L, "Jefferson", "Alquinga", formato.parse("10/02/1998")));
            listaPaciente.add(new paciente(2, 1456156446L, "María", "González", formato.parse("15/03/1995")));
            listaPaciente.add(new paciente(3, 1456156447L, "Carlos", "Pérez", formato.parse("20/04/1992")));
            listaPaciente.add(new paciente(4, 1456156448L, "Ana", "Martínez", formato.parse("05/06/1988")));
            listaPaciente.add(new paciente(5, 1456156449L, "Luis", "Rodríguez", formato.parse("25/07/1990")));
            listaPaciente.add(new paciente(6, 1456156450L, "Elena", "Torres", formato.parse("30/08/2000")));
            listaPaciente.add(new paciente(7, 1456156451L, "Jorge", "Moreno", formato.parse("12/09/1985")));
            listaPaciente.add(new paciente(8, 1456156452L, "Sofía", "Ramírez", formato.parse("22/10/1993")));
            listaPaciente.add(new paciente(9, 1456156453L, "Miguel", "Vargas", formato.parse("18/11/1987")));
            listaPaciente.add(new paciente(10, 1456156454L, "Laura", "Ríos", formato.parse("05/12/1991")));


        return "Bienvenido Odontolodo: "+ odontologo + " LISTA DE PACIENTES " +     listaPaciente;

    }

    @GetMapping("/traer/pacientes/menoresdeedad")
    public String traerMenoresdeEdad(){

        String pacientes = null;
        return pacientes;
    }


}
