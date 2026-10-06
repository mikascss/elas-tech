package org.example.atividadeArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadeArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.addAll(List.of("Bianca", "Camille", "Anne"));
        System.out.println(nomes);

        ArrayList<String> frutas = new ArrayList<>(List.of("Banana", "Jaboticaba", "Maracujá", "Acerola"));
        System.out.println("Primeira fruta: " + frutas.getFirst());
        System.out.println("Última fruta: " + frutas.getLast());
        System.out.println("Existem " + frutas.size() + " frutas.");

        ArrayList<String> nomesTrocados = new ArrayList<>(List.of("Cadeira", "Mesa", "Braço", "Lago"));
        System.out.println(nomesTrocados);
        nomesTrocados.set(2, "Perna");
        System.out.println(nomesTrocados);

        ArrayList<String> cidades = new ArrayList<>(List.of("Aracaju", "Salvador","Pipa", "Maceio"));
        System.out.println(cidades);
        cidades.remove(1);
        System.out.println(cidades);

        ArrayList<String> nomesEmLoop = new ArrayList<>(List.of("Sistema", "Computador", "Arquitetura", "Nuvem", "Redes", "Compiladores"));

        for(int i = 0; i < nomesEmLoop.size(); i ++){
            System.out.println(i + ": " + nomesEmLoop.get(i));
        }

        ArrayList<String> nomesParaEscolha = new ArrayList<>(List.of("Sistema", "Computador", "Arquitetura", "Nuvem", "Redes"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual nome você quer verificar?");
        String escolha = sc.nextLine();
        System.out.println("Sua escolha " + (nomesParaEscolha.contains(escolha) ? "está" : "não está") + " presente.");
        if(nomesParaEscolha.contains(escolha)){
            System.out.println("Sua escolha está na posição " + nomesParaEscolha.indexOf(escolha));
        }

    }
}
