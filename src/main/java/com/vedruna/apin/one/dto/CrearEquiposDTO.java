package com.vedruna.apin.one.dto;
import com.vedruna.apin.one.persistance.model.Equipos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CrearEquiposDTO {
    private int idEquipo;
    private String nombre;

    public CrearEquiposDTO(Equipos eq){
        this.idEquipo = eq.getIdEquipo();
        this.nombre = eq.getNombre();
    }
}
