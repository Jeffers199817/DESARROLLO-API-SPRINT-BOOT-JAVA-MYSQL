/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.helloword.helloWord.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @GetMapping("/hello/{nombre}/{apellido}")
    public String hellloWord(@PathVariable String nombre , @PathVariable String apellido){
        return "Hola bienvenido:" + nombre + " " + apellido;
    }
    
    @GetMapping("/chau")
    public String chaoUsuario(){
        return "Chaou usuario hasta pronto.";
    }
}
