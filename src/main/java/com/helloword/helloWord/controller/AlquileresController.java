package com.helloword.helloWord.controller;

import com.helloword.helloWord.Inquilino;
import com.helloword.helloWord.Propiedad;
import com.helloword.helloWord.PropiedadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Alquiler")
public class AlquileresController {

    @GetMapping("/propiedad/{id}")
    public PropiedadDTO devolverPropiedad(@PathVariable Long id) {

        Inquilino inqui = new Inquilino(1L,"1726618471","Jefferson","Alquinga", "Ingeniero de Software");
        Propiedad propi = new Propiedad(152365L,"Robusta","Puembo",399.0,2000.0);

        PropiedadDTO propiedadDTO = new PropiedadDTO();
        //Datos de la propiedad
        propiedadDTO.setId_propiedad(propi.getId_propiedad());
        propiedadDTO.setTipo(propi.getTipo_propiedad());
        propiedadDTO.setDireccion(propi.getDireccion_propiedad());
        propiedadDTO.setValor_alquiler(propi.getValor_alquiler());
        //Datos del Inquilino
        propiedadDTO.setNombre_inquilino(inqui.getNombre());
        propiedadDTO.setApellido_inquilino(inqui.getApellido());

        return propiedadDTO;
    }
}
