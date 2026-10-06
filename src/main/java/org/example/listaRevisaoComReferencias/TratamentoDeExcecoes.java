package org.example.listaRevisaoComReferencias;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TratamentoDeExcecoes {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Primeiro numero da divisao: ");
            int n1 = sc.nextInt();
            System.out.println("Segundo numero da divisao: ");
            int n2 = sc.nextInt();
            System.out.println(n1 + " por " + n2 + " igual a " + (n1/n2));

            ArrayList<String> cidades = new ArrayList<>(List.of("Salvador", "Natal", "Itacaré", "São Francisco", "Pipa", "João Pessoa"));

            System.out.println("Escolha uma das cidades pelas posição: " + cidades);

            int posicao = sc.nextInt();
            System.out.println(cidades.get(posicao));

            String texto = null;
            System.out.println(texto.length());
        } catch (ArithmeticException ae) {
            System.out.println("Não é permitida divisão por 0.");
        } catch (IndexOutOfBoundsException ie){
            System.out.println("Essa posição não existe na lista dada.");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
