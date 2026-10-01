package org.example;

public class Concatenacao {
    public static void main(String[] args){
        // Questão 1
        String nome = "Camille";
        String cidade = "Aracaju";
        int idade = 23;

        System.out.println("Meu nome é " + nome + ", moro em " + cidade + " e tenho " +
                idade + " anos.");

        // Questão 2
        String produto = "Caneca";
        double preco = 12.50;
        int quantidade = 4;

        System.out.println("Comprei " + quantidade + " unidades de " + produto + " por R$ " + preco + " cada. " +
                "Total: R$ " + preco*quantidade);

        //Questão 3
        int x = 15;
        int y = 4;

        System.out.println("A soma de " + x + " e " + y + " é igual a " + (x + y) + ".");
    }
}
