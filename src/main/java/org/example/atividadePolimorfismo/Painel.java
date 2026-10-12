package org.example.atividadePolimorfismo;

public class Painel {
    static void exibir(String tipo){
        System.out.println("String: " + tipo);
    }

    static void exibir(int tipo){
        System.out.println("int: " + tipo);
    }

    static void exibir(boolean tipo){
        System.out.println("Boolean: " + tipo);
    }

    static void exibir(double tipo){
        System.out.println("double: " + tipo);
    }
}
