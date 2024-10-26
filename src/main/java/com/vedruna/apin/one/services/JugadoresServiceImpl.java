package com.vedruna.apin.one.services;

import java.util.ArrayList;
import java.util.List;

import com.vedruna.apin.one.dto.JugadoresDTO;
import com.vedruna.apin.one.dto.CrearJugadoresDTO;
import com.vedruna.apin.one.dto.EquiposDTO;
import com.vedruna.apin.one.persistance.model.Equipos;
import com.vedruna.apin.one.persistance.model.Jugadores;
import com.vedruna.apin.one.persistance.repository.JugadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JugadoresServiceImpl implements JugadoresServiceI {

    @Autowired
    JugadoresRepository jugadoresRepo;

    @Override
    public JugadoresDTO getJugadorById(int idJugador) {
        return new JugadoresDTO(jugadoresRepo.findByIdJugador(idJugador));
    }

    @Override
    public List<JugadoresDTO> getJugadorByNombre(String nombre) {
        List<Jugadores> jugadoresList =jugadoresRepo.findByNombre(nombre);
        List<JugadoresDTO> jugadoresDTOList = new ArrayList<JugadoresDTO>();

        for (Jugadores jugador : jugadoresList) {
            jugadoresDTOList.add(new JugadoresDTO(jugador));
        }

        return jugadoresDTOList;
    }

    @Override
    public List<JugadoresDTO> getJugadorByEdad(int edad) {
        List<Jugadores> jugadoresList = jugadoresRepo.findByEdad(edad);
        List<JugadoresDTO> jugadoresDTOList = new ArrayList<>();

        for (Jugadores jugador : jugadoresList) {
            jugadoresDTOList.add(new JugadoresDTO(jugador));
        }

        return jugadoresDTOList;
    }

     @Override
        public List<JugadoresDTO> findAll() {
            List<Jugadores> jugadoresList = jugadoresRepo.findAll();
            List<JugadoresDTO> jugadoresDTOList = new ArrayList<>();

            for (Jugadores jugador : jugadoresList) {
                jugadoresDTOList.add(new JugadoresDTO(jugador));
            }

            return jugadoresDTOList;
        }

    @Override
    public void insertJugador(CrearJugadoresDTO jugador) {
  
        Jugadores newJugador = new Jugadores();
        newJugador.setIdJugador(jugador.getIdJugador());
        newJugador.setNombre(jugador.getNombre());
        jugadoresRepo.save(newJugador);
    }



    
}