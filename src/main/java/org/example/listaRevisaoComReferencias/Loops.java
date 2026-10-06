package org.example.listaRevisaoComReferencias;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um número para ser a altura de umm triangulo");
        int numero = sc.nextInt();
        for(int i = 1; i <= numero; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
