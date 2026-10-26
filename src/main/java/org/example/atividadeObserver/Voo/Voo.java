package org.example.atividadeObserver.Voo;

import java.util.ArrayList;

public class Voo {

    private ArrayList<ObservadorVoo> passageiros = new ArrayList<>();

    public void adicionarObservador(ObservadorVoo observadorVoo){
        this.passageiros.add(observadorVoo);
    }

    public void mudarStatus(String status){
        for(ObservadorVoo passageiro : passageiros){
            passageiro.atualizar(status);
        }
    }

}
