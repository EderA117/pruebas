package org.example;

import org.example.controlador.ControladorComics;
import org.example.vista.VentanaComic;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        VentanaComic view = new VentanaComic("Pruebas");
        ControladorComics controller = new ControladorComics(view);
    }
}