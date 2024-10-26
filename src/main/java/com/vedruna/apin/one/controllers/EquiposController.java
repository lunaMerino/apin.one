package com.vedruna.apin.one.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.apin.one.dto.CrearEquiposDTO;
import com.vedruna.apin.one.dto.EquiposDTO;
import com.vedruna.apin.one.services.EquiposServiceI;



@RestController
@RequestMapping("/api/v1/equipo")
@CrossOrigin
public class EquiposController {

    @Autowired
    EquiposServiceI equipoMngmnt;
    @GetMapping
    public List<EquiposDTO> findAll(){
        return equipoMngmnt.findAll();
    }

    @GetMapping("/id/{idequipo}")
    public EquiposDTO selectWhereIdEquiposDTO(@PathVariable int idequipo){
        return equipoMngmnt.getEquipoById(idequipo);
    }

    @GetMapping("/nombre/{nombre}")
    public List<EquiposDTO> selectWhereNombrEquiposDTO(@PathVariable String nombre){
        return equipoMngmnt.getEquipoByNombre(nombre);
    }

    @PostMapping("/insert")
    public void insertEquipo(@RequestBody CrearEquiposDTO equipo){
       equipoMngmnt.insertEquipo(equipo);
    }
    
    
}
