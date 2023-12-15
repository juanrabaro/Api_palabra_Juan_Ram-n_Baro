package com.example.funciona.Controllers;

import com.example.funciona.Models.PalabraModel;
import com.example.funciona.Repositories.IPalabraRepository;
import com.example.funciona.Services.PalabraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PalabraController {

    @Autowired
    PalabraService palabraService;

    @Autowired
    IPalabraRepository iPalabraRepository;

    @GetMapping("/")
    public String welcome() {
        return "Welcome!!";
    }

    @GetMapping("/getAllPalabras")
    public ResponseEntity<Object> getPalabrasRandom() {
        ArrayList<String> listaPalabrasRandom = palabraService.getAllPalabras();
        return ResponseEntity.ok(listaPalabrasRandom);
    }

    @GetMapping("/getPalabras/{cantidadPalabras}")
    public ResponseEntity<Object> getPalabrasRandom(@PathVariable Integer cantidadPalabras) {
        ArrayList<String> listaPalabrasResultado = palabraService.getPalabras(cantidadPalabras);
        return ResponseEntity.ok(listaPalabrasResultado);
    }

    @GetMapping("/contiene/{letras}")
    public ResponseEntity<Object> getPalabrasRandom(@PathVariable String letras) {
        return ResponseEntity.ok(palabraService.getContienePalabras(letras));
    }

    @GetMapping("/prefijo/{prefijo}")
    public ResponseEntity<Object> getPrefijo(@PathVariable Character prefijo) {
        return ResponseEntity.ok(palabraService.getPrefijo(prefijo));
    }

    @GetMapping("/sufijo/{sufijo}")
    public ResponseEntity<Object> getSufijo(@PathVariable Character sufijo) {
        return ResponseEntity.ok(palabraService.getSufijo(sufijo));
    }

    @GetMapping("/palabras")
    public List<PalabraModel> getPalabras() {
        return iPalabraRepository.findAll();
    }
}
