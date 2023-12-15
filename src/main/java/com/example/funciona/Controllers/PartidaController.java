package com.example.funciona.Controllers;

import com.example.funciona.Models.JugadorModel;
import com.example.funciona.Services.JuegoService;
import com.example.funciona.Services.JugadorService;
import com.example.funciona.Services.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PartidaController {

    @Autowired
    private PartidaService partidaService;

    @GetMapping("/{jugadorModel}/puntos")
    public Integer obtenerPuntos(@PathVariable JugadorModel jugadorModel) {
        return partidaService.obtenerTotalPuntos(jugadorModel);
    }
}
