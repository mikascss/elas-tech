package org.example.tratamentoExcecoes;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecaoInputMismatch {
    /*Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número,
    trate a InputMismatchException e mostre uma mensagem pedindo um número.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Idade: ");
        try {
            int idade = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Passe um número inteiro.");
        }
    }
}
