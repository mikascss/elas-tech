package org.example.revisaoSOLIDEAbstracao;

import org.example.revisaoSOLIDEAbstracao.sistemaDeFuncionarios.Desenvolvedor;
import org.example.revisaoSOLIDEAbstracao.sistemaDeFuncionarios.FolhaPagamento;
import org.example.revisaoSOLIDEAbstracao.sistemaDeFuncionarios.NotificadorEmail;
import org.example.revisaoSOLIDEAbstracao.sistemaDeFuncionarios.NotificadorSMS;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Café");
        produto.setPreco(-17.60);
        produto.setQuantidade(2);

        System.out.printf("%s - R$ %.2f - x%d\n", produto.getNome(), produto.getPreco(), produto.getQuantidade());

        Retangulo retangulo = new Retangulo("retângulo", 10, 4);
        retangulo.exibirNome();
        System.out.println(retangulo.calcularArea());

        Desenvolvedor dev = new Desenvolvedor("Camille", 3400);

        NotificadorEmail notificadorEmail = new NotificadorEmail();
        FolhaPagamento folhaPagamento = new FolhaPagamento(notificadorEmail);
        folhaPagamento.pagar(dev);

        NotificadorSMS notificadorSMS = new NotificadorSMS();
        FolhaPagamento folhaPagamento1 = new FolhaPagamento(notificadorSMS);
        folhaPagamento1.pagar(dev);
    }
}
