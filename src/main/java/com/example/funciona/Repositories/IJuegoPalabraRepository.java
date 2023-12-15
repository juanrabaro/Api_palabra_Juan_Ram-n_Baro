package com.example.funciona.Repositories;

import com.example.funciona.Models.JuegoPalabraModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface IJuegoPalabraRepository extends JpaRepository<JuegoPalabraModel, Integer> {
}
