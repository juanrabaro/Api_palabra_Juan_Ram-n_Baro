package com.example.funciona.Repositories;

import com.example.funciona.Models.JugadorModel;
import com.example.funciona.Models.PartidaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPartidaRepository extends JpaRepository<PartidaModel, Integer> {
    List<PartidaModel> findByJugadorModel(JugadorModel jugadorModel);
}
