package com.example.funciona.Services;

import com.example.funciona.Repositories.IJuegoPalabraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JuegoPalabraService {

    @Autowired
    IJuegoPalabraRepository iJuegoPalabraRepository;
}