package org.example.petshop;

public class Pet {
    String nome;
    String especie;
    double peso;
    String porte;

    public String calcularPorte(){
        if(peso < 10){
            return "Pequeno";
        } else if(peso >= 10 && peso < 25){
            return "Médio";
        } else {
            return "Grande";
        }
    }
}
