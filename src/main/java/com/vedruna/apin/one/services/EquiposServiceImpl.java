package com.vedruna.apin.one.services;

import java.util.ArrayList;
import java.util.List;


import com.vedruna.apin.one.dto.EquiposDTO;
import com.vedruna.apin.one.dto.CrearEquiposDTO;
import com.vedruna.apin.one.persistance.model.Equipos;
import com.vedruna.apin.one.persistance.repository.EquiposRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquiposServiceImpl implements EquiposServiceI{
    @Autowired
    EquiposRepository equiposRepo;

    @Override
    public EquiposDTO getEquipoById(int idEquipo) {
        return new EquiposDTO(equiposRepo.findByIdEquipo(idEquipo));
    }

    @Override
    public List<EquiposDTO> getEquipoByNombre(String nombre) {
        List<Equipos> equiposList =equiposRepo.findByNombre(nombre);
        List<EquiposDTO> equiposDTOList = new ArrayList<EquiposDTO>();

        for (Equipos equipo : equiposList) {
            equiposDTOList.add(new EquiposDTO(equipo));
        }

        return equiposDTOList;
    }


    // ++
    @Override
    public List<EquiposDTO> findAll() {
        List<Equipos> equiposList = equiposRepo.findAll();
        List<EquiposDTO> equiposDTOList = new ArrayList<>();

        for (Equipos equipo : equiposList) {
            equiposDTOList.add(new EquiposDTO(equipo));
        }

        return equiposDTOList;
    }
    // ++



    @Override
    public void insertEquipo(CrearEquiposDTO equipos) {
        //Crear alumno a partir del DTO
        Equipos newEquipo= new Equipos();
        newEquipo.setIdEquipo(equipos.getIdEquipo());
        newEquipo.setNombre(equipos.getNombre());


        //Guardar alumno
        equiposRepo.save(newEquipo);
    }

}