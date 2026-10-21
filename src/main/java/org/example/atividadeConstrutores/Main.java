package org.example.atividadeConstrutores;

public class Main {
    public static void main(String[] args) {
        Agendamento agendamento = Agendamento.builder()
                .nomePet("koga")
                .desconto(0)
                .hidratacao(true)
                .horario("13h")
                .laco(false)
                .observacao("sem observação")
                .perfume(false)
                .servico("banho")
                .build();
        agendamento.mostrar();
    }
}
