package com.example.funciona.Services;

import com.example.funciona.Models.JugadorModel;
import com.example.funciona.Repositories.IJugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JugadorService {

    @Autowired
    private IJugadorRepository iJugadorRepository;

    public Optional<JugadorModel> obtenerPuntosJugador(Integer jugadorID) {
        System.out.println(iJugadorRepository.findByIdJugador(jugadorID));
        return iJugadorRepository.findById(jugadorID);
    }
}