package com.example.parcial;

public class Recursividad {
    public static void main(String[] args) {
        Divisor divisor = new Divisor();
        

        try{
            divisor.EjecutarOperacion(15);    
        }catch(Exception ex){
            System.out.println("ocurrio una excepcion " + ex.getMessage());
        }   
    }
}