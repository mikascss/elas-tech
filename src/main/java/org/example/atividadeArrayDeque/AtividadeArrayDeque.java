package org.example.atividadeArrayDeque;

import java.util.ArrayDeque;
import java.util.List;

public class AtividadeArrayDeque {
    public static void main(String[] args) {
//        1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila
//        e quantas pessoas tem.

        ArrayDeque<String> pessoas = new ArrayDeque<>();
        pessoas.add("Paulo");
        pessoas.add("Livia");
        pessoas.add("Layza");
        System.out.println("Fila: " + pessoas + " | tem " + pessoas.size() + " pessoas");

//        2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
//        imprima a fila logo depois. Repare que ela não mudou.

        ArrayDeque<Integer> fila = new ArrayDeque<>();
        fila.addAll(List.of(1,2,3,4,5));
        System.out.println(fila.peek());
        System.out.println(fila);

//        3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila
//        depois. Compare com o exercício 2.

        fila.poll();
        System.out.println(fila);


//        4. Crie uma fila com três nomes e atenda todos usando
//        while (!fila.isEmpty()). No final, imprima "Fila vazia!".

        ArrayDeque<String> nomes = new ArrayDeque<>(List.of("Camille", "Norma","Bianca"));
        while(!nomes.isEmpty()){
            System.out.println(nomes.poll());
        }
        System.out.println("Fila vazia!");

//        5. Crie uma fila com três nomes e use contains para responder duas
//        perguntas: se "Bia" está na fila e se "Zoe" está.

        ArrayDeque<String> nomesFila = new ArrayDeque<>(List.of("bia", "Kravitz", "Harry"));
        System.out.println("tem bia na fila? " + nomesFila.contains("bia"));
        System.out.println("tem zoe na fila? " + nomesFila.contains("zoe"));

//        6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
//        - se estiver vazia  -> "Não tem ninguém na fila."
//                - se tiver gente    -> "Próximo: [nome]"
//        Depois adicione uma pessoa e teste de novo.

        ArrayDeque<String> filaVazia = new ArrayDeque<>();
        imprimir(filaVazia);
        filaVazia.add("Beyonce");
        imprimir(filaVazia);

    }

    static void imprimir(ArrayDeque<String> fila){
        System.out.println(fila.isEmpty() ? "Não tem ninguém na fila." : "Próximo: [" + fila.peek() + "]");
    }
}
