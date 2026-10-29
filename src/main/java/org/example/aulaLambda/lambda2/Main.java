package org.example.aulaLambda.lambda2;

public class Main {

    public static void main(String[] args) {
        repetirAcao(() -> System.out.println("oi"));

        mostrarResultado((valor) -> valor * 2, 2);
        mostrarResultado((valor) -> valor*valor, 3);
        mostrarResultado((valor) -> -valor, 3);

        executarSe((valor) -> valor % 2 == 0, 4, () -> System.out.println("é par!"));
        executarSe((valor) -> valor % 2 == 0, 7, () -> System.out.println("é par!"));
    }

    static void repetirAcao(Acao acao){
        acao.executar();
        acao.executar();
    }

    static void mostrarResultado(Operacao op, int valor){
        System.out.println(op.aplicar(valor));
    }

    static void executarSe(Condicao cond, int valor, Acao acao){
        if(cond.testar(valor)){
            acao.executar();
        }
    }
}
