package com.vedruna.apin.one.services;
import java.util.List;

import com.vedruna.apin.one.dto.CrearEquiposDTO;
import com.vedruna.apin.one.dto.EquiposDTO;

public interface EquiposServiceI {
    List<EquiposDTO> findAll();
    EquiposDTO getEquipoById(int idequipo);
    List<EquiposDTO> getEquipoByNombre(String nombre);
    void insertEquipo(CrearEquiposDTO equipo);
}