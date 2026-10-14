package org.example.atividadeEncapsulamento;

public class ExecutarContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());

        conta.setTitular("");
        conta.setTitular("Ana");
        System.out.println(conta.getTitular());

        conta.depositar(500);
        conta.depositar(-100);
        conta.sacar(2000);
        conta.sacar(200);

        System.out.println("Saldo: " + conta.getSaldo());

        System.out.println("Número da conta: " + conta.getNumeroConta());
//        conta.setNumeroConta("X");
    }
}
