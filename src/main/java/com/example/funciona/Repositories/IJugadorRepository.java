package com.example.funciona.Repositories;

import com.example.funciona.Models.JugadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IJugadorRepository extends JpaRepository<JugadorModel, Integer> {
    JugadorModel findByIdJugador(Integer idJugador);
}
