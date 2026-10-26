package org.example.atividadeObserver.Estoque;

import java.util.ArrayList;

public class Estoque {
    ArrayList<ObservadorEstoque> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorEstoque observadorEstoque){
        this.observadores.add(observadorEstoque);
    }

    public void setQuantidade(int quantidade){
        for(ObservadorEstoque observador : observadores){
            observador.atualizar(quantidade);
        }
    }
}
