package org.example.atividadePolimorfismo;

public class Calculadora {
    public static double calcularArea(double lado){
        return lado * lado ;
    }

    public static double calcularArea(double base, double altura){
        return base * altura ;
    }

    public static double calcularArea(int raio){
        return 3.14159 * raio * raio ;
    }
}
