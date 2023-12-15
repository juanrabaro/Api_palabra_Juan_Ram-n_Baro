package com.example.funciona.Services;

import com.example.funciona.Repositories.IPalabraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

@Service
public class PalabraService {

    @Autowired
    private IPalabraRepository iPalabraRepository;

    String rutaArchivo = "./palabras/0_palabras_todas.txt";

    public static ArrayList<String> leerArchivo(String rutaArchivo) {
        ArrayList<String> palabras = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en palabras utilizando un espacio como delimitador
                String[] palabrasLinea = linea.split("\\s+");

                // Agregar cada palabra a la lista
                palabras.addAll(Arrays.asList(palabrasLinea));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return palabras;
    }

    public ArrayList<String> getAllPalabras() {
        return leerArchivo(rutaArchivo);
    }

    public ArrayList<String> getPalabras(Integer cantidadPalabras) {
        ArrayList<String> listaPalabras = leerArchivo(rutaArchivo);
        Collections.shuffle(listaPalabras);
        ArrayList<String> listaPalabrasResultado = new ArrayList<>();

        for (var i = 0; i < cantidadPalabras; i++) {
            listaPalabrasResultado.add(listaPalabras.get(i));
        }
        return listaPalabrasResultado;
    }

    public Boolean getContienePalabras(String letras) {
        ArrayList<String> listaPalabras = leerArchivo(rutaArchivo);
        Collections.shuffle(listaPalabras);
        String palabraBuscada = listaPalabras.get(0);

        return palabraBuscada.contains(letras);
    }


    public Boolean getPrefijo(Character letra) {
        ArrayList<String> listaPalabras = leerArchivo(rutaArchivo);
        Collections.shuffle(listaPalabras);
        String palabraBuscada = listaPalabras.get(0);

        return palabraBuscada.charAt(0) == letra;
    }

    public Boolean getSufijo(Character letra) {
        ArrayList<String> listaPalabras = leerArchivo(rutaArchivo);
        Collections.shuffle(listaPalabras);
        String palabraBuscada = listaPalabras.get(0);

        return palabraBuscada.charAt(palabraBuscada.length()-1) == letra;
    }
}