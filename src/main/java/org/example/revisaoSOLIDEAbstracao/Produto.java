package org.example.revisaoSOLIDEAbstracao;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        if(preco > 0) {
            this.preco = preco;
        }
    }

    public void setQuantidade(int quantidade){
        if(quantidade >= 0){
            this.quantidade = quantidade;
        }
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }
}
