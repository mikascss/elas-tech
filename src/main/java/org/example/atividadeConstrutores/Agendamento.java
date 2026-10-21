package org.example.atividadeConstrutores;

import lombok.Builder;

@Builder
public class Agendamento {
    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    private String observacao;
    private double desconto;

    public void mostrar(){
        System.out.println(nomePet + ", " + servico + ", " + horario + ", " + (perfume ? "com" : "sem")
                + " perfume e " + (laco ? "com" : "sem") + " laço, " + (hidratacao ? "com" : "sem")
                + " hidratação, " + observacao + ", " + (desconto == 0 ? "sem desconto" : desconto + " de desconto"));

    }
}
