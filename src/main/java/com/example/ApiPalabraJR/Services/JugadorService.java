package com.example.ApiPalabraJR.Services;

import com.example.ApiPalabraJR.Models.JugadorModel;
import com.example.ApiPalabraJR.Repositories.IJugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JugadorService {

    IJugadorRepository iJugadorRepository;
    @Autowired
    public JugadorService(IJugadorRepository iJugadorRepository) {
        this.iJugadorRepository = iJugadorRepository;
    }

    public ArrayList<JugadorModel> getAllJugadores() {
        return (ArrayList<JugadorModel>) iJugadorRepository.findAll();
    }
}
