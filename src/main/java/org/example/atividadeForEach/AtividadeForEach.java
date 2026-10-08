package org.example.atividadeForEach;

import java.util.ArrayList;
import java.util.List;

public class AtividadeForEach {
    public static void main(String[] args) {
//        1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each,
//                um por linha.

        String[] nomes = {"Beyonce", "Timothee", "Zendaya", "Tom Holland"};
        for(String nome : nomes){
            System.out.println(nome);
        }

//        5. Pegue o exercício 1 e escreva ele DE NOVO com o for normal,
//                usando o índice. Deixe os dois na mesma classe e compare.

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

//        2. Crie um ArrayList com 5 notas e imprima todas usando for-each.

        ArrayList<Double> notas = new ArrayList<>(List.of(4.5,6.7,10.0,7.0, 8.5));
        notas.forEach(System.out::println);

//        3. Com o array de notas {8, 6, 10, 7}, use for-each para somar
//        todas e mostrar a soma e a média.

        double[] notasArray = {8, 6, 10, 7};
        double soma = 0;
        for(double nota : notasArray){
            soma += nota;
        }
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + (soma/notasArray.length));

//        4. Com um array de nomes, use for-each e um if para contar quantos
//        têm mais de 5 letras. Mostre o total. Dica: usem o metodo length.

        List<String> nomesArray = new ArrayList<>(List.of("Beyonce", "Timothee", "Zendaya", "Tom Holland"));
        int i = 0;
        for(String nome : nomesArray){
            if(nome.length() > 5){
                i++;
            }
        }
        System.out.println(i);


    }
}
