package org.example.atividadeObserver.Voo;

public class Main {
    public static void main(String[] args) {
        Voo voo = new Voo();
        Passageiro bianca = new Passageiro();
        voo.adicionarObservador(bianca);
        voo.mudarStatus("Embarque iniciado");

        PainelAeroporto painel = new PainelAeroporto();
        voo.adicionarObservador(painel);
        voo.mudarStatus("Atrasado");
    }

}
