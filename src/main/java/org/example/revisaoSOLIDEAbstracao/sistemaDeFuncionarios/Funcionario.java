package org.example.revisaoSOLIDEAbstracao.sistemaDeFuncionarios;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void setSalarioBase(double salarioBase){
        if(salarioBase < 0) {
            this.salarioBase = salarioBase;
        }
    }

    public String getNome(){
        return nome;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public abstract double calcularSalario();
}
