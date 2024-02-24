package com.example.parcial;

public class Divisor {


    public float EjecutarOperacion(int numero){

        if((numero / 2) < 2){
            System.out.println(numero + " / " + 2 + " = " + (numero / 2));
            return numero;
        }
        System.out.println(numero + " / " + 2 + " = " + (numero / 2));
        return EjecutarOperacion(numero / 2);
    }
}
