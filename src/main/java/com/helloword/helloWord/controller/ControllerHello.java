/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.helloword.helloWord.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JEFFERSON
 */


@RestController
public class ControllerHello {
    
    @GetMapping("/h")
    public String saidHello(){ 
        
        return "Spring Boot es una herramienta para desarorolla APis en Java";
        
    }
    
    @GetMapping("/hello/{nombre}/{apellido}/{edad}/{profesion}")
    public String hellloWord(@PathVariable String nombre , @PathVariable String apellido, @PathVariable int edad, @PathVariable  String profesion ){
        return "Hola bienvenido:" + nombre + " " + apellido + '\n' + "Su edad: " + edad 
                + '\n'+ "Profesión: " + profesion;
    }
    
    @GetMapping("/chau")
    public String chaoUsuario(){
        return "Chaou usuario hasta pronto.";
    }
    
    @GetMapping("/bye")
    public String byeUsuario(@RequestParam String nombre, @RequestParam int edad, @RequestParam String profesion){
        
        return "El nombre es: " + nombre + " Su edad es: " + edad + " Su profesión es : "+ profesion ;
        
        
    }
    
    
    // Ejercicio 1 
    
    @GetMapping("/suma/{numero1}/{numero2}")
    public String sumarDosNumeros(@PathVariable int numero1, @PathVariable int numero2){ 
        return  "CALCULADOR DE SUMA  " + " Número 1 = "+ numero1 + " Número 2 = " + numero2  + " La suma total es: " + (numero1 + numero2) ; 
    }
    



    


    
}
