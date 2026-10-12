package org.example.atividadeHeranca;

public class Pessoa {
    String nome;
    int idade;

    void apresentar(){
        System.out.println("Oi, sou " + this.nome + " e tenho " + this.idade + " anos.");
    }
}
