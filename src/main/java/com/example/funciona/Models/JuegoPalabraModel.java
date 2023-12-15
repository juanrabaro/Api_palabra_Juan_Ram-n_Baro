package com.example.funciona.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Juego_Palabra_DifficultyP")
public class JuegoPalabraModel {

    @EmbeddedId
    private JuegoPalabraId juegoPalabraId;

    @Column(name = "difficulty_p", nullable = false, length = 45)
    private String difficultyP;

    @ManyToOne
    private JuegoModel juegoModel;

    @ManyToOne
    private PalabraModel palabraModel;

}
