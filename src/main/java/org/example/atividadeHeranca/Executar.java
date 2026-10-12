package org.example.atividadeHeranca;

import java.util.PropertyPermission;

public class Executar {
    public static void main(String[] args) {
        // Questao 1

        Aluna aluna = new Aluna();
        aluna.nome = "Camille";
        aluna.idade = 23;
        aluna.apresentar();

        // Questao 2

        aluna.curso = "Engenharia de Computação";
        aluna.apresentar();
        aluna.estudar();

        // Questao 3
        Professora professora = new Professora();
        professora.nome = "Flora";
        professora.idade = 25;
        professora.disciplina = "Engenharia de Software";
        professora.lancarNota(aluna.nome, 7.8);

        // Questao 4
        professora.apresentar();
        aluna.apresentar();

        // Questao 5

        Diretora diretora = new Diretora();
        diretora.nome = "Dina";
        diretora.definirMeta("finalizar relatórios mensais");
        diretora.aprovarFerias("Joao Pedro");
        diretora.baterPonto();

        // Questao 6
        Gerente gerente = new Gerente();
        gerente.nome = "Max";
        gerente.baterPonto();
        gerente.aprovarFerias("Norma");
        gerente.notificar("BEAT UP CHANEL$");
        gerente.exportar();

    }
}
