package com.example.funciona.Controllers;

import com.example.funciona.Models.JugadorModel;
import com.example.funciona.Services.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class JugadorController {

    @Autowired
    private JugadorService jugadorService;

    @GetMapping("/puntos/{jugadorId}")
    public Optional<Integer> obtenerJugadorPorId(@PathVariable Integer jugadorId) {
        return jugadorService.obtenerPuntosJugador(jugadorId)
                .map(JugadorModel::getScoreJugador);
    }
}
