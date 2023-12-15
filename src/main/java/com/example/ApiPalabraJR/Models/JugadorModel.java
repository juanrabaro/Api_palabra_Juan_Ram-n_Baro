package com.example.ApiPalabraJR.Models;

import jakarta.persistence.*;

@Entity
public class JugadorModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "puntuacion")
    private int puntuacion;

    // Constructores, getters y setters

    public void Jugador() {
    }

    public void Jugador(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
