package com.example.parcial;

public class Sedan extends Auto {
    
    public Sedan(String marca){
        super(marca);
    }

    @Override
    public void accelerar() {
        System.out.println("El sedan " + this.getMarcar() + " esta acelerando");
    }
}
