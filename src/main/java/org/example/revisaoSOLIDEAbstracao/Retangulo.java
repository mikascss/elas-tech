package org.example.revisaoSOLIDEAbstracao;

public class Retangulo extends Forma{
    double largura;
    double altura;

    public Retangulo(String nome, double largura, double altura) {
        super(nome);
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea(){
        return largura * altura;
    }
}
