package org.example.petshop;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Petshop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = -1;

        Pet[] pets = new Pet[5];
        int contadorPets = 0;
        ArrayDeque<String> filaDeBanho = new ArrayDeque<>();

        while(opcao != 0){
            try {
                System.out.println("=== PETSHOP ===");
                System.out.println("1 - Cadastrar pet");
                System.out.println("2 - Listar pets");
                System.out.println("3 - Buscar pet");
                System.out.println("4 - Listar espécies cadastradas");
                System.out.println("5 - Entrar na fila de banho");
                System.out.println("6 - Atender o próximo");
                System.out.println("7 - Tratar pet");
                System.out.println("8 - Polimorfismo");
                System.out.println("0 - Sair");
                System.out.print("Escolha: ");
                opcao = sc.nextInt();
                sc.nextLine();
                switch (opcao) {
                    case 1:
                        Pet pet = cadastrar();
                        pets[contadorPets] = pet;
                        contadorPets++;
                        System.out.println("Pet cadastrado! Agora são " + contadorPets + " " +
                                "pet(s).");
                        break;
                    case 2:
                        imprimirPets(pets);
                        break;
                    case 3:
                        buscarPet(pets);
                        break;
                    case 4:
                        listarEspeciesCadastradas(pets);
                        break;
                    case 5:
                        entrarNaFilaDeBanho(filaDeBanho);
                        break;
                    case 6:
                        atenderProximo(filaDeBanho);
                        break;
                    case 7:
                        tratarPet();
                        break;
                    case 8:
                        if(pets[0] != null) {
                            imprimir(pets[0]);
                            imprimir(pets[0], "=== FICHA DO PET ===");
                        }
                        break;
                    case 0:
                        System.out.println("Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("Sua escolha deve ser um número. Repita a operação.1");
                sc.nextLine();
            }
        }
    }

    static Pet cadastrar(){
        Scanner sc = new Scanner(System.in);
        Pet pet;

        System.out.print("Nome do pet: ");
        String nome = sc.nextLine();
        System.out.print("Espécie: ");
        String especie = sc.nextLine();
        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();
        if(especie.equalsIgnoreCase("gato")){
            pet = new Gato();
        } else if(especie.equalsIgnoreCase("cachorro")){
            pet = new Cachorro();
        } else {
            pet = new Pet();
        }
        pet.nome = nome;
        pet.especie = especie;
        pet.peso = peso;
        pet.calcularPorte();
        pet.imprimirFichaDoPet();
        return pet;
    }

    static void imprimirPets(Pet[] pets){
        if(pets[0] == null){
            System.out.println("Nenhum pet cadastrado.");
            return;
        }
        System.out.println("--- PETS CADASTRADOS ---");
        for(int i = 0; i < pets.length; i++){
            Pet pet = pets[i];
            if(pet == null) {
                break;
            }
            System.out.printf("%s (%s) - %.1f kg - Porte %s\n", pet.nome, pet.especie,
                    pet.peso, pet.porte);
            pet.emitirSom();
        }
    }

    static void buscarPet(Pet[] pets){
        System.out.print("Qual pet você procura? ");
        Scanner sc = new Scanner(System.in);
        String nomePet = sc.nextLine();
        boolean encontrado = false;
        for(int i = 0; i < pets.length; i++){
            Pet pet = pets[i];
            if(pet == null) {
                break;
            }
            if(pet.nome.equalsIgnoreCase(nomePet)){
                System.out.printf("Encontrado: %s (%s) - %.1f kg\n", pet.nome, pet.especie,
                        pet.peso);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Pet não encontrado.");
        }
    }

    static void listarEspeciesCadastradas(Pet[] pets){
        HashSet<String> especies = new HashSet<>();
        for(int i = 0; i < pets.length; i++){
            Pet pet = pets[i];
            if(pet == null){
                System.out.println("Nenhuma espécie cadastrada.");
                break;
            }
            String especie = pet.especie.substring(0,1).toUpperCase() + pet.especie.substring(1).toLowerCase();
            especies.add(especie);
        }

        if(pets[0] == null){
            return;
        }

        System.out.println("--- ESPÉCIES CADASTRADAS ---");
        for(String especie : especies){
            System.out.println("- " + especie);
        }
        System.out.println("Total de espécies diferentes: " + especies.size());
    }

    static void entrarNaFilaDeBanho(ArrayDeque<String> filaBanho){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do pet pra entrar na fila: ");
        String nomePet = sc.nextLine();
        filaBanho.add(nomePet);
        System.out.println(nomePet + " entrou na fila.");
        System.out.println("Fila agora: " + filaBanho);
    }


    static void atenderProximo(ArrayDeque<String> filaBanho){
        System.out.println("Próximo da fila: " + filaBanho.peek());
        System.out.println("Atendendo " + filaBanho.poll() + "...");
        System.out.println("Fila agora: " + filaBanho);
    }

    static void tratarPet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do pet: ");
        String nome = sc.nextLine();

        ArrayList<Servico> servicos = new ArrayList<>(List.of(new Banho(), new Tosa(), new Consulta()));

        for(Servico servico : servicos){
            servico.executar(nome);
        }
    }

    static void imprimir(Pet pet){
        System.out.println("Nome: " + pet.nome);
    }

    static void imprimir(Pet pet, String titulo){
        System.out.println(titulo);
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.printf("Peso: %.1f kg\n", pet.peso);
        System.out.println("Porte: " + pet.porte);
    }
}
