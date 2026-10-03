package org.example.tratamentoExcecoes;

import java.util.Scanner;

public class ArrayIndexOutOfBoundInducaoAoErro {
    /* Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a
     ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe." Depois do try/catch,
      imprima "O programa continua funcionando."*/

    public static void main(String[] args) {
        String[] nomes = {"Panela", "Pijama", "Televisão"};
        System.out.println("Escolha uma das posições do array: 0 ao 5");
        Scanner sc = new Scanner(System.in);
        try {
            int posicao = sc.nextInt();
            System.out.println(nomes[posicao]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Essa posição não existe.");
        }
    }
}
