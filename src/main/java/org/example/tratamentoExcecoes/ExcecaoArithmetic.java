package org.example.tratamentoExcecoes;

import java.util.Scanner;

public class ExcecaoArithmetic {
    public static void main(String[] args) {
        /*Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo
        . Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem
         explicando que não dá pra dividir por zero.*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        dividir(n1, n2);
    }

    static void dividir(int n1, int n2){
        try {
            System.out.println(n1/n2);
        } catch (ArithmeticException ae) {
            System.out.println("Não é possível dividir por zero.");
        }
    }
}
