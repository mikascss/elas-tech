package org.example.atividadeHeranca;

public class Gerente extends Funcionario implements Notificavel, Exportavel {
    void aprovarFerias(String quem){
        System.out.println(super.nome + " aprovou as férias de " + quem);
    }

    @Override
    public void notificar(String mensagem){
        System.out.println(mensagem);
    }

    @Override
    public void exportar(){
        System.out.println("Exportar");
    }
}
