package com.example.funciona.Services;

import com.example.funciona.Repositories.IJuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JuegoService {

    @Autowired
    IJuegoRepository iJuegoRepository;
}