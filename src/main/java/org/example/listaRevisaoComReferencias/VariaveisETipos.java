package org.example.listaRevisaoComReferencias;

public class VariaveisETipos {
    public static void main(String[] args) {
        String nome = "Camille";
        int idade = 23;
        double altura = 1.57;
        boolean jaProgramei = true;
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("altura: " + altura);
        System.out.println("Já programou? " + (jaProgramei ? "sim" : "não"));

        String cidade = "Salvador";
        System.out.println("Eu moro em " + cidade + ".");

        String primeiroNome = "Camille";
        String sobrenome = "Sousa";
        System.out.println(primeiroNome + " " + sobrenome);

        double preco = 29.9;
        System.out.printf("Esse produto custa %.2f\n", preco);

        boolean temCarteira = true;
        System.out.println(temCarteira ? "tem carteira" : "não tem carteira");


        int a = 10;
        int b = 20;
        System.out.println("a =  " + a + " e b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("a =  " + a + " e b = " + b);
    }
}
