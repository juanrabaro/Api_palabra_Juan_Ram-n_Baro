package com.example.funciona.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name="Partida")
public class PartidaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_partida")
    private Integer idPartida;

    @Column(name = "score_partida", nullable = false)
    private Integer scorePartida;

    @Column(name = "n_try", nullable = false)
    private Integer numTry;

    @Column(name = "word", nullable = false, length = 45)
    private String word;

    @Column(name = "datetime")
    private Date datetime;

    @ManyToOne
    @JoinColumn(name = "Jugador_id_jugador")
    private JugadorModel jugadorModel;

    @ManyToOne
    @JoinColumn(name = "Juego_id_juego")
    private JuegoModel juegoModel;
}