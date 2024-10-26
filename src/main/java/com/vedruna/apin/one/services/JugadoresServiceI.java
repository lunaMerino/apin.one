package com.vedruna.apin.one.services;
import java.util.List;

import com.vedruna.apin.one.dto.CrearJugadoresDTO;
import com.vedruna.apin.one.dto.JugadoresDTO;

public interface JugadoresServiceI {
    List<JugadoresDTO> findAll();
    JugadoresDTO getJugadorById(int idjugador);
    List<JugadoresDTO> getJugadorByNombre(String jugador);
    List<JugadoresDTO> getJugadorByEdad(int edad);
    void insertJugador(CrearJugadoresDTO jugador);
}