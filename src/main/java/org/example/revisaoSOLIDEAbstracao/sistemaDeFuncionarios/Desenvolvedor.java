package org.example.revisaoSOLIDEAbstracao.sistemaDeFuncionarios;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    public double calcularSalario(){
        return super.getSalarioBase() * 1.20;
    }
}
