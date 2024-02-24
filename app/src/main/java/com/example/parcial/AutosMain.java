package com.example.parcial;

public class AutosMain {
    public static void main(String[] args) {
        Camion camion = new Camion("Chevrolet");
        Sedan sedan = new Sedan("BMW");

        camion.accelerar();
        sedan.accelerar();

        sedan.frenar();
        camion.frenar();

    }
}
