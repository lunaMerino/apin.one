package com.vedruna.apin.one.dto;
import  com.vedruna.apin.one.persistance.model.Jugadores;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JugadoresDTO {
    private int idJugador;
    private String nombre;
    private int edad;
    private int equipos_idequipo;


    public JugadoresDTO(Jugadores ju) {
        this.idJugador = ju.getIdJugador();
        this.nombre = ju.getNombre();
        this.edad = ju.getEdad();
        // this.equipos_idequipo = ju.getEquiposIdEquipo();
        
    }
}