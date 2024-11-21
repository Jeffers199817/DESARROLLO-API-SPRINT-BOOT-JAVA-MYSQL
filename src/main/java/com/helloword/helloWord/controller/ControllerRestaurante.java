package com.helloword.helloWord.controller;

import com.helloword.helloWord.Restaurante;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/restaurante")
public class ControllerRestaurante {

    //1 El restaurante desea una aplicación que permita que los cleintes sean capaces consultar los datos de los palto del meño


    @GetMapping("/platos/{idPlato}")
    public String traerPlatos(@PathVariable int idPlato) {

        String menu = null;

        List<Restaurante> listaPlatos = new ArrayList<Restaurante>();
        listaPlatos.add(new Restaurante(1,"Arrecife Puembo","Puembo","0962857715","Ceviche Cámaron",34.5,"Ceviche sabroso, rico y delicioso"));
        listaPlatos.add(new Restaurante(2,"La Fragata","Quito","0991234567","Encebollado",28.0,"Encebollado típico con atún"));
        listaPlatos.add(new Restaurante(3,"Marisquería El Coral","Guayaquil","0987654321","Arroz Marinero",32.5,"Arroz marinero con mariscos frescos"));
        listaPlatos.add(new Restaurante(4,"El Rincón de la Costa","Cuenca","0971122334","Camarones al Ajillo",25.0,"Camarones salteados con ajo y perejil"));
        listaPlatos.add(new Restaurante(5,"Costa Brava","Salinas","0966677889","Parrillada de Mariscos",45.0,"Parrillada con mariscos variados y verduras"));
        listaPlatos.add(new Restaurante(6,"Puerto Azul","Manta","0955512345","Langostinos en Salsa de Coco",38.0,"Langostinos frescos en una salsa de coco cremosa"));
        listaPlatos.add(new Restaurante(7,"La Marisqueira","Loja","0944433221","Pulpo a la Gallega",40.0,"Pulpo con papas y aceite de oliva"));
        listaPlatos.add(new Restaurante(8,"El Pescador","Esmeraldas","0933322110","Filete de Pescado",26.0,"Filete de pescado fresco con salsa de maracuyá"));
        listaPlatos.add(new Restaurante(9,"Las Brisas del Mar","Portoviejo","0922298765","Arroz con Camarones",30.0,"Arroz con camarones al estilo costeño"));
        listaPlatos.add(new Restaurante(10,"Bahía Azul","Bahía de Caráquez","0911188877","Pescado Frito",22.5,"Pescado frito crujiente con limón y ensalada"));

        for(Restaurante restaurante: listaPlatos){

            if(restaurante.getIdPlato() == idPlato){

                menu = "El nombre de restaurante es: "  + restaurante.getNombreRestaurante() + " Dirección: " + restaurante.getDireccionRestaurante() + " Número: " + restaurante.getNumeroRestaurante() + "Nombre Plato: " + restaurante.getNombrePlato() + " Precio: " + restaurante.getPrecioPlato() + " $" + " Descripción: " + restaurante.getDescripcionPlato();


                break;
            }else{
                menu= "No existe ese plato en el menú";
            }


        }



        return menu;
    }




}
