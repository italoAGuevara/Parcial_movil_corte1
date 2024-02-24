package com.example.parcial;

public class Camion extends Auto {

    public Camion(String marca){
        super(marca);
    }

    @Override
    public void accelerar() {
        System.out.println("El camion " + this.getMarcar() + " esta acelerando");
    }
    
}
