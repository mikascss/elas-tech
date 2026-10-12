package org.example.atividadeHeranca;

public class Pessoa {
    public String nome;
    public int idade;

    public void apresentar(){
        System.out.println("Oi, sou " + this.nome + " e tenho " + this.idade + " anos.");
    }
}
