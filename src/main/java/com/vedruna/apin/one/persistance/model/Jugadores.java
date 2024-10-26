package com.vedruna.apin.one.persistance.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "jugadores")
@Data
@NoArgsConstructor

public class Jugadores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idjugador", nullable = false)
    private int idJugador;

    @Column(name="nombre", length = 45)
    private String nombre;

    @Column(name="edad", length = 11)
    private int edad;

    // @Column(name="equipos_idequipo", length = 11)
    // private int equipos_idequipo;



    @ManyToOne(fetch= FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="equipos_idequipo", nullable = false)
    private Equipos idequipos;

}