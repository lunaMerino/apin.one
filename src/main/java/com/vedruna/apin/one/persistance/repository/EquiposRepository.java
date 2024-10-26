package com.vedruna.apin.one.persistance.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vedruna.apin.one.persistance.model.Equipos;

@Repository
public interface EquiposRepository extends JpaRepository<Equipos, Integer>{
    Equipos findByIdEquipo(int idequipo);
    List<Equipos> findByNombre(String nombre);
    Equipos save(Equipos equipos);
}