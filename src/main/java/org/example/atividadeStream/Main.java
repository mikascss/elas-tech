package org.example.atividadeStream;

import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // Questão 1
        List<Integer> nrsInteiros = IntStream.range(1,7).boxed().toList();
        System.out.println(nrsInteiros);
        List<Integer> nrsPares = nrsInteiros.stream()
                .filter(numero -> numero % 2 == 0)
                .toList();
        System.out.println(nrsPares);

        // Questão 2
        List<String> nomeFrutasMin = List.of("manga", "morango", "uva", "jaboticaba");
        System.out.println(nomeFrutasMin.stream()
                .map(String::toUpperCase).toList());

        // Questão 3
        List<String> cidades = List.of("Aracaju", "Salvador", "Petrolina", "Santos");
        System.out.println("Quantidade de cidades que começam com S: " + cidades.stream()
                .filter(cidade -> cidade.startsWith("S")).count());
    }
}
