package org.example.atividadePolimorfismo;

import org.example.atividadeHeranca.Pessoa;

public class Professora extends Pessoa {
    String disciplina;

    public void apresentar(String cargo) {
        System.out.println("Oi, sou " + nome + ", " + cargo);
    }

    void lancarNota(String aluna, double nota){
        System.out.printf("%s lançou nota %.1f para %s. \n", super.nome, nota, aluna);
    }
}
