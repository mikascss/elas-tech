package org.example.atividadeHeranca;

public class Professora extends Pessoa {
    String disciplina;

    void lancarNota(String aluna, double nota){
        System.out.printf("%s lançou nota %.1f para %s\n", super.nome, nota, aluna);
    }

    @Override
    public void apresentar(){
        System.out.println("Oi, sou " + super.nome + " e ensino " + this.disciplina);
    }
}
