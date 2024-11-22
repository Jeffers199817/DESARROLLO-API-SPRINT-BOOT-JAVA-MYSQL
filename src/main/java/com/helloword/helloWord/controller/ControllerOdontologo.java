package com.helloword.helloWord.controller;


import com.helloword.helloWord.Paciente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/odontologo")
public class ControllerOdontologo {


    @GetMapping("/traer/pacientes")
    public List<Paciente> traerPaciente() throws ParseException {

        List<Paciente> listaPacientes = new ArrayList<Paciente>();
        String paciente = null;



        listaPacientes.add(new Paciente(1L, "52333654", "Yasmín", "Romero", LocalDate.of(2016,8,18)));
        listaPacientes.add(new Paciente(2L, "13558965", "Sara", "Barrios",LocalDate.of(1960,1,20)));
        listaPacientes.add(new Paciente(3L, "49663221", "Benjamín", "Goichuk", LocalDate.of(2008,11,25)));
        listaPacientes.add(new Paciente(4L, "50111889", "Gladys", "Andreiszyn", LocalDate.of(2015,9,27)));
        listaPacientes.add(new Paciente(5L, "12000320", "Eduardo", "Malim", LocalDate.of(1958,5,13)));
        return   listaPacientes;

    }

    @GetMapping("/traer/pacientes/menores")
    public List<Paciente> traerMenoresdeEdad(){

        List<Paciente> listaPacientes = new ArrayList<Paciente>();
        listaPacientes.add(new Paciente(1L, "52333654", "Yasmín", "Romero", LocalDate.of(2016,8,18)));
        listaPacientes.add(new Paciente(2L, "13558965", "Sara", "Barrios",LocalDate.of(1960,1,20)));
        listaPacientes.add(new Paciente(3L, "49663221", "Benjamín", "Goichuk", LocalDate.of(2008,11,25)));
        listaPacientes.add(new Paciente(4L, "50111889", "Gladys", "Andreiszyn", LocalDate.of(2015,9,27)));
        listaPacientes.add(new Paciente(5L, "12000320", "Eduardo", "Malim", LocalDate.of(1958,5,13)));
        // creo lista para guardar a los menores
       List<Paciente> listaMenores = new ArrayList<>();

       //Recorro la lista

        for(Paciente pac : listaPacientes) {

            // Creo una variable para almacenar la fecha actual

            LocalDate hoy = LocalDate.now();

            //Calculo periodo entre fecha de nacimiento el paciente y fecha de hoy
            Period paci_anios = Period.between(pac.getFechaNacimiento(), hoy);

            if (paci_anios.getYears() < 18) {
                System.out.println("Cantidad de año es: " + paci_anios.getYears() + " El paciente: " + pac.getNombre());
                listaMenores.add(pac);
            }

        }




        return   listaMenores;


    }


}
