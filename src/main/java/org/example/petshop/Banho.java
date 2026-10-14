package org.example.petshop;

public class Banho implements Servico {
    public void executar(String nomePet){
        System.out.println("Dando banho no pet " + nomePet + ".");
    }
}
