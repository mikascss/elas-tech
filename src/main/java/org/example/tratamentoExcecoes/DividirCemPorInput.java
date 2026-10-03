package org.example.tratamentoExcecoes;

import java.util.Scanner;

public class DividirCemPorInput {

    /* Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número. Trate a
     ArithmeticException para o caso de ela digitar 0.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um número para dividir por 100:");
            int numero = sc.nextInt();
            System.out.println(100/numero);
        } catch (ArithmeticException ae){
            System.out.println("Não é permitido divisão por 0.");
        }
    }
}
