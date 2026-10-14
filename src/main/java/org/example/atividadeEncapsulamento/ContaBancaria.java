package org.example.atividadeEncapsulamento;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta = "001-X";

    public String getTitular(){
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNumeroConta(){
        return this.numeroConta;
    }

    public void setTitular(String titular){
        if(titular.isEmpty()){
            System.out.println("Inválido! Mantido " + this.titular);
        } else {
            this.titular = titular;
        }
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Valor inválido!");
            return;
        }
        this.saldo += valor;
        registrarLog(titular + ": depósito de " + valor);
    }

    public void sacar(double valor){
        if(temSaldo(valor)){
            this.saldo -= valor;
            registrarLog(titular + ": saque de " + valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    private boolean temSaldo(double valor){
        return this.saldo >= valor;
    }

    private void registrarLog(String acao){
        System.out.println("[LOG] " + acao);
    }
}
