package org.example.atividadePolimorfismo;

import org.example.atividadeHeranca.Aluna;
import org.example.atividadeHeranca.Pessoa;

public class Executar {
    public static void main(String[] args) {
        System.out.println(Calculadora.calcularArea(4.5));
        System.out.println(Calculadora.calcularArea(3, 6));
        System.out.println(Calculadora.calcularArea(4));

        Painel.exibir(3);
        Painel.exibir(3.5);
        Painel.exibir("tipo");
        Painel.exibir(true);

        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 25;
        flora.disciplina = "Java e IA";

        Aluna aluna = new Aluna();
        aluna.nome = "Adela";
        aluna.idade = 21;

        flora.lancarNota(aluna.nome, 6.7);
        flora.apresentar("professora");

        Estagiaria estagiaria = new Estagiaria();
        estagiaria.nome = "Mika";
        estagiaria.idade = 24;

        Pessoa pessoa = estagiaria;
        pessoa.apresentar();

        mostrarFicha(aluna);
        mostrarFicha(flora);
        mostrarFicha(estagiaria);

        MeioDePagamento forma;
        forma = new Pix();
        forma.pagar(150.00);
        forma = new Boleto();
        forma.pagar(150.00);
    }

    static void mostrarFicha(Pessoa p){
        p.apresentar();
    }
}
