package com.example.parcial;

abstract class Auto implements IArrancar {
    private String marca;

    public Auto(String marca){
        this.marca = marca;
    }

    public String getMarcar() {
        return marca;
    }

    public void frenar(){
        System.out.println("El auto" + marca + " está frenando...");
    }
}

