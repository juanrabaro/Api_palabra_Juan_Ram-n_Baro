package com.example.funciona.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@Entity
@Table(name="Equipo")
public class EquipoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id-equipo")
    private Integer idEquipo;

    @Column(name = "name_equipo", nullable = false, length = 45)
    private String nameEquipo;

    @Column(name = "badge_equipo", nullable = false, length = 45)
    private String badgeEquipo;

    @Column(name = "score_equipo", nullable = false)
    private Integer scoreEquipo;

}
