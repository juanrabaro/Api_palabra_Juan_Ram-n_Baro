package com.example.ApiPalabraJR.Repositories;


import com.example.ApiPalabraJR.Models.JugadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IJugadorRepository extends JpaRepository<JugadorModel, Long> {
    @Query(value = "SELECT * FROM `APIpalabra`.`JUGADOR`", nativeQuery = true)
    List<JugadorModel> findJugadores();
}
