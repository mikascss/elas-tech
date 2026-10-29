package org.example.aulaLambda.lambda1;

public class Main {
    public static void main(String[] args) {
        Saudacao saudacao = () -> System.out.println("oi");

        saudacao.executar();

        Impressora impressoraMaiusculo = texto -> System.out.println(texto.toUpperCase());
        impressoraMaiusculo.imprimir("Ola camille");

        Impressora impressoraMinusculo = texto -> System.out.println(texto.toLowerCase());
        impressoraMinusculo.imprimir("Ola camille");

        Calculo soma = (a, b) -> a + b;
        Calculo multiplicacao = (a, b) -> a * b;
        Calculo maximo = (a , b) -> Math.max(a, b);

        System.out.println(soma.calcular(5, 5));
        System.out.println(multiplicacao.calcular(5, 5));
        System.out.println(maximo.calcular(3, 5));
    }
}
