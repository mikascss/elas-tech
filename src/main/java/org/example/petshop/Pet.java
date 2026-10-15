package org.example.petshop;

public class Pet {
    String nome;
    String especie;
    double peso;
    String porte;

    public void cadastrar(String nome, String especie, double peso){
        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
        this.calcularPorte();
        imprimirFichaDoPet();
    }

    protected void emitirSom(){
        System.out.println(nome + " emitiu um som.");
    }

    public void calcularPorte(){
        if(peso < 10){
            porte = "Pequeno";
        } else if(peso >= 10 && peso < 25){
            porte = "Médio";
        } else {
            porte = "Grande";
        }
    }

    public void imprimirFichaDoPet(){
        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Espécie: " + this.especie);
        System.out.printf("Peso: %.1f kg\n", this.peso);
        System.out.println("Porte: " + this.porte);
    }
}
