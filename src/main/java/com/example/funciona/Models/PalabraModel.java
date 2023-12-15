package com.example.funciona.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@Entity
@Table(name="Palabra")
public class PalabraModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_palabra")
    private Integer idPalabra;

    @Column(name = "palabra", nullable = false, length = 45)
    private String palabra;
}
