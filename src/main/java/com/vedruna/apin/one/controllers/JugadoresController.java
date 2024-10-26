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

import com.vedruna.apin.one.dto.CrearJugadoresDTO;
import com.vedruna.apin.one.dto.JugadoresDTO;
import com.vedruna.apin.one.services.JugadoresServiceI;



@RestController
@RequestMapping("/api/v1/jugador")
@CrossOrigin
public class JugadoresController {
    @Autowired
    JugadoresServiceI jugadorMngmnt;

    @GetMapping
    public List<JugadoresDTO> findAll(){
        return jugadorMngmnt.findAll();
    }

    @GetMapping("/id/{idjugador}")
    public JugadoresDTO selectWhereIdJugadoresDTO(@PathVariable int idjugador){
        return jugadorMngmnt.getJugadorById(idjugador);
    }
    
    @GetMapping("/nombre/{nombre}")
    public List<JugadoresDTO> selectWhereNombreJugadoresDTO(@PathVariable String nombre){
        return jugadorMngmnt.getJugadorByNombre(nombre);
    }

    @GetMapping("/edad/{edad}")
    public List<JugadoresDTO> selectWhereEdadJugadoresDTO(@PathVariable int edad){
        return jugadorMngmnt.getJugadorByEdad(edad);
    }

    // getidequipo??
    
    @PostMapping("/insert")
    public void insertJugador(@RequestBody CrearJugadoresDTO jugador){
        jugadorMngmnt.insertJugador(jugador);
    }
    
}
