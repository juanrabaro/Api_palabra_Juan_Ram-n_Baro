package com.example.funciona.Repositories;

import com.example.funciona.Models.EquipoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface IEquipoRepository extends JpaRepository<EquipoModel, Integer> {
}
