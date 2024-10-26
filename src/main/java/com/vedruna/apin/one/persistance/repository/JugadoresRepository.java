package com.vedruna.apin.one.persistance.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vedruna.apin.one.persistance.model.Jugadores;

@Repository
public interface JugadoresRepository extends JpaRepository <Jugadores, Integer>{
    Jugadores findByIdJugador(int idjugador);
    List<Jugadores> findByNombre(String nombre);
    List<Jugadores> findByEdad(int edad);
    // Jugadores findByEquiposIdEquipo(int equipos_idequipo);
    Jugadores save(Jugadores jugadores);
}