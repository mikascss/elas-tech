package org.example.atividadeHeranca;

public class Aluna extends Pessoa {
    String curso;

    void estudar(){
        System.out.println(super.nome + " está estudando " + this.curso);
    }
}
