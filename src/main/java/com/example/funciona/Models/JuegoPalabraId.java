package com.example.funciona.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class JuegoPalabraId implements Serializable {

    @Column(name = "Juego_id_juego")
    private Integer juegoIdJuego;

    @Column(name = "Palabra_id_palabra")
    private Integer palabraIdPalabra;

}
