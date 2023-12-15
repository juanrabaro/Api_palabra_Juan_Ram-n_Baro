package com.example.funciona.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@Entity
@Table(name="Juego")
public class JuegoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_juego")
    private Integer idJuego;

    @Column(name = "difficulty_j", nullable = false, length = 45)
    private String difficultyJ;

    @Column(name = "description", nullable = false, length = 45)
    private String description;

    @Column(name = "max_tries", nullable = false)
    private Integer maxTries;
}