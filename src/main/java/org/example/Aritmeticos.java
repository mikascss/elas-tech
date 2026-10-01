package org.example;

public class Aritmeticos {
    public static void main(String[] args){
        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2+2));
        /*no primeiro os números estão sendo concatenados e
        no segundo estão sendo somados por causa do uso de parenteses*/

        //Questão 1
        int a = 10;
        int b = 3;
        System.out.println("Soma: " + a + " + " + b + " = " + (a+b));
        System.out.println("Subtração: " + a + " - " + b + " = " + (a-b));
        System.out.println("Divisão: " + a + " / " + b + " = " + (a/b));
        System.out.println("Multiplicação: " + a + " * " + b + " = " + (a*b));
        System.out.println("Resto: " + a + " % " + b + " = " + (a%b));

        System.out.println("-------------------------------");

        //Questão 2
        double x = 10;
        double y = 3;
        System.out.println("Soma: " + x + " + " + y + " = " + (x+y));
        System.out.println("Subtração: " + x + " - " + y + " = " + (x-y));
        System.out.println("Divisão: " + x + " / " + y + " = " + (x/y));
        System.out.println("Multiplicação: " + x + " * " + y + " = " + (x*y));
        System.out.println("Resto: " + x + " % " + y + " = " + (x%y));

        System.out.println("-------------------------------");

        //Questão 3
        double nota1 = 8;
        double nota2 = 6;
        double nota3 = 10;
        double soma = nota1 + nota2 + nota3;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + (soma/3));

        System.out.println("-------------------------------");

        //Questão 4
        a = 3;
        b = 4;
        int c = 5;
        int operacao = a + b * c;
        System.out.println("a + b * c = " + operacao);

        System.out.println("-------------------------------");

        //Questão 5
        int operacaoComParenteses = (a + b)*c;
        System.out.println("(a + b) * c) = " + operacaoComParenteses);

        int segundos = 3785;
        int umMinutoEmSegundos = 60;
        int minutos = segundos / umMinutoEmSegundos;
        int segundosRestantes = segundos % umMinutoEmSegundos;
        System.out.println(segundos + " equivale a " + minutos + " minutos inteiros " +
                "com " + segundosRestantes + " segundos restantes.");

    }
}
