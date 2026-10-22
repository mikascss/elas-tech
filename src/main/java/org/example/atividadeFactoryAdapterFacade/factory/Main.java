package org.example.atividadeFactoryAdapterFacade.factory;

public class Main {
    public static void main(String[] args) {
        Animal gato = AnimalFactory.getAnimal("gato");
        Animal cachorro = AnimalFactory.getAnimal("cachorro");

        gato.emitirSom();
        cachorro.emitirSom();
    }
}
