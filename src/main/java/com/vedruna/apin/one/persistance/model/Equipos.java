package com.vedruna.apin.one.persistance.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "equipos")
@Data
@NoArgsConstructor

public class Equipos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idequipo", nullable = false)
    private int idEquipo;

    @Column(name="nombre", length = 45)
    private String nombre;


    @OneToMany(mappedBy = "idequipos", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Jugadores> jugadores;
    public Equipos(int idEquipo) {
        this.idEquipo = idEquipo;
    }

}