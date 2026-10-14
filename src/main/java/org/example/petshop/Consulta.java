package org.example.petshop;

public class Consulta implements Servico{
    public void executar(String nomePet){
        System.out.println("Consultando " + nomePet + ".");
    }
}
