package org.example.revisaoSOLIDEAbstracao;

public abstract class Forma {
    String nome;

    public Forma(String nome){
        this.nome = nome;
    }

    public void exibirNome(){
        System.out.println(nome);
    }

    public abstract double calcularArea();
}
