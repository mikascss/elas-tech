package org.example.petshop;

import java.util.Scanner;

public class Petshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pet pet = new Pet();

        System.out.print("Nome do pet: ");
        pet.nome = sc.nextLine();
        System.out.print("Espécie: ");
        pet.especie = sc.nextLine();
        System.out.print("Peso (kg): ");
        pet.peso = sc.nextDouble();
        pet.porte = pet.calcularPorte();
        imprimirFichaDoPet(pet);

        Pet[] pets = new Pet[5];
        pets[0] = pet;

        imprimirPets(pets);

    }

    static void imprimirFichaDoPet(Pet pet){
        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.printf("Peso: %.1f kg\n", pet.peso);
        System.out.println("Porte: " + pet.porte);
    }

    static void imprimirPets(Pet[] pets){
        for(int i = 0; i < pets.length; i++){
            Pet pet = pets[i];
            if(pet == null) {
                break;
            }
            System.out.printf("%s (%s) - %.1f kg - Porte %s\n", pet.nome, pet.especie,
                    pet.peso, pet.porte);

        }
    }

}
