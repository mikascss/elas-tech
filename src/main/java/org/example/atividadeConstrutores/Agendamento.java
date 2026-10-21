package org.example.atividadeConstrutores;

public class Agendamento {
    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    private String observacao;
    private double desconto;

    public Agendamento(String nomePet, String servico, String horario,
                       boolean perfume, boolean laco, boolean hidratacao,
                       String observacao, double desconto){
        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;
    }

    public void mostrar(){
        System.out.println(nomePet + ", " + servico + ", " + horario + ", " + (perfume ? "com" : "sem")
                + " perfume e " + (laco ? "com" : "sem") + " laço, " + (hidratacao ? "com" : "sem")
                + " hidratação, " + observacao + ", " + (desconto == 0 ? "sem desconto" : desconto + " de desconto"));

    }
}
