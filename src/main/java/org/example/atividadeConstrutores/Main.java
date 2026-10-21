package org.example.atividadeConstrutores;

public class Main {
    public static void main(String[] args) {
        Agendamento agendamento = new Agendamento("Koga",
                "banho", "10h",false, false, true, "sem observação", 0);
        agendamento.mostrar();
    }
}
