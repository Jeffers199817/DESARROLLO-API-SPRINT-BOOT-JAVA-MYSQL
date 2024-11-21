/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.helloword.helloWord.controller;

import com.helloword.helloWord.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    
    //Ejercicio 2 
    
    @GetMapping("/nutricionista")
    public String estadoPeso(@RequestParam int peso){
         String respuesta=null;
        if(peso >=1 && peso <= 18.5){ 
            respuesta = " Peso insuficiente";
        }
        if(peso>= 18.6 && peso>=24.9){
            respuesta = " Peso normal";
        }
        if(peso>=25.0 && peso>=29.9){ 
            respuesta= " Sobrepeso";
            
        }
        if(peso>=30){ 
            respuesta = " Obesidad , Cuidate mucho";
        }
        String respuest = "CALCULADORA DE PESO CORPORAL " + "Su peso es: " + peso + " Su diagnostico es: " + respuesta;
        
       
        return respuest;
    }
    
    
    @GetMapping("/CalculadoraDeGalones")
    public String calculadora(@RequestParam String nombre, @RequestParam double galones){ 
            
        double calculoGaL = (galones * 3.78541);
        
        
        return "Bienvenido " + nombre + " Galones ingresados es: " + galones + " Transformación a litros es: " + calculoGaL + " Lt"; 
    }


    //Ejercicio 5

    @PostMapping("/crearUsuario")

    public void crearUsuario(@RequestBody Cliente cli){
        System.out.println("Cliente creado Exitosamente");
        System.out.println("El nombre del cliente es:" + cli.getNombre());
        System.out.println("El apellido del cliente es:" + cli.getApellido());
        System.out.println("La direccion del cliente es:" + cli.getDireccion());
        System.out.println("El telefono del cliente es:" + cli.getTelefono());
        System.out.println("Prueba exitosamente"    );
    }

    
//Respuesta para un memtodo get

    @GetMapping("/traer/clientes")
    @ResponseBody
    public List<Cliente> traerUsuario(){
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1,"Jefferson","Alquinga","Puembo","0962857715"));
        listaClientes.add(new Cliente(2,"Bernardo" ,"Alquinga","Quito","09625844457"));
        return listaClientes;
    }

    
}
