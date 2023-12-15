package com.example.ApiPalabraJR.Controllers;


import com.example.ApiPalabraJR.Models.JugadorModel;
import com.example.ApiPalabraJR.Services.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/jugador")
public class JugadorController {

    JugadorService jugadorService;
    @Autowired
    public JugadorController(JugadorService jugadorService) {
        this.jugadorService = jugadorService;
    }

    @GetMapping("/jugadores")
    public ResponseEntity<ArrayList<JugadorModel>> getAllWords() {
        return ResponseEntity.ok(jugadorService.getAllJugadores());
    }
}
