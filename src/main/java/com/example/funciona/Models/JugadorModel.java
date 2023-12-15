package com.example.funciona.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@Entity
@Table(name="Jugador")
public class JugadorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jugador")
    private Integer idJugador;

    @Column(name = "score_jugador", nullable = false)
    private Integer scoreJugador;

    @Column(name = "user_jugador", nullable = false, length = 45)
    private String userJugador;

    @Column(name = "avatar_img", nullable = false)
    private String avatarImg;

    @ManyToOne
    @JoinColumn(name = "Equipo_id_equipo")
    private EquipoModel equipoModel;
}
