package org.example.listaRevisaoComReferencias;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        int a = 15,
            b = 4;

        System.out.println((a + b));
        System.out.println((a - b));
        System.out.println((a * b));
        System.out.println((a / b));
        System.out.println((a % b));

        int saldo = 1000;
        System.out.println(saldo);
        saldo += 250;
        System.out.println(saldo);
        saldo -= 380;
        System.out.println(saldo);

        a = 10;
        b = 10;
        System.out.println((a == b));
        System.out.println((a != b));
        System.out.println((a > b));
        System.out.println((a >= b));

        int idade = 20;
        boolean temCarteira = true;
        System.out.println("Idade maior igual a 18 e tem carteira? " + (idade >= 18 && temCarteira));

        int numero = 35;
        System.out.println("Resto da divisão de " + numero + " por 2: " + (numero % 2));

        int quantidade = 3;
        double valorArroz = 5.5;
        System.out.printf("%d pacotes de arroz a R$ %.2f cada fica num total de R$ %.2f.\n", quantidade, valorArroz, (quantidade*valorArroz));

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um número: ");
        int numeroQualquer = sc.nextInt();
        System.out.println("Esse número é divisível por 3 e por 5 ao mesmo tempo? " +
                ((numeroQualquer % 3 == 0) && (numeroQualquer % 5 == 0)));
    }
}
