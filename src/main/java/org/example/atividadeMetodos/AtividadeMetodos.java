package org.example.atividadeMetodos;

import java.util.Scanner;

public class AtividadeMetodos {
    public static void main(String[] args) {
        mostrarBoasVindas();
        Utilidades.saudar("Camille");
        Utilidades.saudar("Bianca");
        Utilidades.saudar("Norma");

        System.out.println(Utilidades.dobro(3));

        Scanner sc = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.printf("Média de %.2f e %.2f = %.2f\n", nota1, nota2, Utilidades.calcularMedia(nota1, nota2));

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.println("É " + (Utilidades.ehMaiorDeIdade(idade) ? "maior" : "menor") + " de idade.");

        System.out.println(Utilidades.somar(1, 2));
        System.out.println(Utilidades.somar(1, 2, 3));
        System.out.println(Utilidades.somar(1.5, 2.5));

        Utilidades.saudacao();
        Utilidades.saudacao("Camille");

    }

    static void mostrarBoasVindas(){
        System.out.println("Bem-vinda ao curso de java!");
    }
}
