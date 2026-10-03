package org.example.tratamentoExcecoes;

import java.util.Arrays;
import java.util.Scanner;

public class ExcecaoArrayIndexOutOfBounds {
    /* Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição.
    Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array
    só vai de 0 a 4.*/

    public static void main(String[] args) {
        double[] notas = {4.5, 7, 8.7, 9.4, 6};
        System.out.println("Escolha uma posição do array " + Arrays.toString(notas));
        Scanner sc = new Scanner(System.in);
        int posicao = sc.nextInt();

        try {
            System.out.println(notas[posicao]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("As posições do array só vão de 0 a 4.");
        }
    }
}
