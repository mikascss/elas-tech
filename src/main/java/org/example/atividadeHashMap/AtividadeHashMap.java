package org.example.atividadeHashMap;

import java.util.HashMap;

public class AtividadeHashMap {
    public static void main(String[] args) {
//        1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
//        inteiro e depois use get para mostrar a idade de uma delas.

        HashMap<String, Integer> nomesEIdades = new HashMap<>();
        nomesEIdades.put("Camille", 23);
        nomesEIdades.put("Slayyyter", 32);
        nomesEIdades.put("Adela", 21);
        System.out.println(nomesEIdades);
        System.out.println(nomesEIdades.get("Adela"));

//        2. Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,
//                imprima, e depois faça put de "café" DE NOVO com valor 7.50.
//                Imprima outra vez e veja o que aconteceu com o tamanho.

        HashMap<String, Double> produtosEPrecos = new HashMap<>();
        produtosEPrecos.put("café", 5.0);
        System.out.println(produtosEPrecos);
        produtosEPrecos.put("café", 7.50);
        System.out.println(produtosEPrecos);

//        3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
//        dentro de um if para mostrar o telefone de alguém que está na agenda
//        e de alguém que não está.

        HashMap<String,String> agenda = new HashMap<>();
        agenda.put("Camille", "99800-0000");
        agenda.put("Bianca", "99902-1102");
        if(agenda.containsKey("Camille")){
            System.out.println(agenda.get("Camille"));
        }

        if(!agenda.containsKey("Charli")){
            System.out.println("Charli não está.");
        }

//        4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
//                Use getOrDefault para mostrar a quantidade de um produto que existe
//        e de um que não existe (devolvendo 0). Depois tente com get normal
//        no que não existe e compare.

        HashMap<String, Integer> produtosEQuantidade = new HashMap<>();
        produtosEQuantidade.put("Café", 5);
        produtosEQuantidade.put("Queijo", 7);
        System.out.println(produtosEQuantidade.getOrDefault("Café", 0));
        System.out.println(produtosEQuantidade.getOrDefault("Picanha", 0));

        System.out.println(produtosEQuantidade.get("Café"));
        System.out.println(produtosEQuantidade.get("Picanha"));
//
//        5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
//        Remova uma delas e imprima de novo.


        HashMap<String, Double> notas = new HashMap<>();
        notas.put("Rihanna", 6.9);
        notas.put("Jesse", 9.4);
        notas.put("Devon", 10.0);
        System.out.println(notas);
        System.out.println(notas.size());
        notas.remove("Jesse");
        System.out.println(notas);



    }
}
