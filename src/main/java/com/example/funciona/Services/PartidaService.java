package com.example.funciona.Services;

import com.example.funciona.Models.JugadorModel;
import com.example.funciona.Models.PartidaModel;
import com.example.funciona.Repositories.IJugadorRepository;
import com.example.funciona.Repositories.IPartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartidaService {

    @Autowired
    IPartidaRepository iPartidaRepository;

    public int obtenerTotalPuntos(JugadorModel jugadorId) {
        List<PartidaModel> partidas = iPartidaRepository.findByJugadorModel(jugadorId);

        return partidas.stream().mapToInt(PartidaModel::getScorePartida).sum();
    }

}