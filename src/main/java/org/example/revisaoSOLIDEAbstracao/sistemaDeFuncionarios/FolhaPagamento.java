package org.example.revisaoSOLIDEAbstracao.sistemaDeFuncionarios;

public class FolhaPagamento {

    private final Notificador notificador;

    public FolhaPagamento(Notificador notificador){
        this.notificador = notificador;
    }

    public void pagar(Funcionario f){
        double salario = f.calcularSalario();

        notificador.notificar("O salário de " + f.getNome() + " é " + salario);
    }
}
