package org.example.atividadeHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AtividadeHashSet {
    public static void main(String[] args) {
        /*Crie um HashSet de nomes e adicione quatro valores, sendo um deles
            repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
            com o repetido.
        */

        HashSet<String> nomes = new HashSet<>();
        nomes.add("Camille");
        nomes.add("Bianca");
        nomes.add("Norma");
        nomes.add("Camille");

        System.out.println("Conjunto: " + nomes);
        System.out.println("Tamanho: " + nomes.size());


        /*Crie um HashSet de cores usando addAll. Depois use contains dentro
   de um if para avisar se a cor "verde" já está no conjunto ou não.*/

        HashSet<String> cores = new HashSet<>();
        cores.addAll(Set.of("Vermelho", "Azul", "Verde", "Preto", "Cinza"));
        if (cores.contains("Verde")) {
            System.out.println("A cor verde já está no conjunto.");
        }

        /*Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
        tirar os repetidos. Imprima os dois e compare.*/

        ArrayList<String> nomesRepetidos = new ArrayList<>(List.of("Cadeira", "Computador", "RAM", "Computador", "RAM"));
        HashSet<String> setNomesRepeidos = new HashSet<>(nomesRepetidos);

        System.out.println(nomesRepetidos);
        System.out.println(setNomesRepeidos);

        /*Crie um HashSet com três CPFs e imprima. Depois remova um deles e
        imprima de novo, junto com o tamanho.*/

        HashSet<String> cpfs = new HashSet<>(Set.of("006.458.670-71", "491.435.450-09", "959.276.050-01"));
        System.out.println(cpfs);
        cpfs.remove("959.276.050-01");
        System.out.println(cpfs);

        /*. Crie um HashSet com três frutas e percorra ele com for,
        imprimindo uma por linha.*/

        HashSet<String> frutas = new HashSet<>(List.of("banana", "manga", "caju"));
        frutas.forEach(System.out::println);

//        Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
//        imprima o isEmpty() de novo.

        HashSet<Integer> hashSetVazio = new HashSet<>();
        System.out.println(hashSetVazio.isEmpty());
        hashSetVazio.add(1);
        System.out.println(hashSetVazio.isEmpty());

    }
}
