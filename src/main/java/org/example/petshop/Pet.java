package org.example.petshop;

import java.util.Scanner;

public class Pet {
    String nome;
    String especie;
    double peso;
    String porte;

    public String calcularPorte(){
        if(peso < 10){
            return "Pequeno";
        } else if(peso >= 10 && peso < 25){
            return "Médio";
        } else {
            return "Grande";
        }
    }

    public void cadastrar(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do pet: ");
        this.nome = sc.nextLine();
        System.out.print("Espécie: ");
        this.especie = sc.nextLine();
        System.out.print("Peso (kg): ");
        this.peso = sc.nextDouble();
        this.porte = this.calcularPorte();
        imprimirFichaDoPet(this);
    }

    private static void imprimirFichaDoPet(Pet pet){
        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.printf("Peso: %.1f kg\n", pet.peso);
        System.out.println("Porte: " + pet.porte);
    }
}
