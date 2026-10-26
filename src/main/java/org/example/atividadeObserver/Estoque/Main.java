package org.example.atividadeObserver.Estoque;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        RegistroEstoque registroEstoque = new RegistroEstoque();
        estoque.adicionarObservador(registroEstoque);
        estoque.setQuantidade(4);
        estoque.setQuantidade(10);
    }
}
