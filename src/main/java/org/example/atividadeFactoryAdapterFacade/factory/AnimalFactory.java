package org.example.atividadeFactoryAdapterFacade.factory;

public class AnimalFactory {
    public static Animal getAnimal(String especie){
        if(especie.equalsIgnoreCase("cachorro")){
            return new Cachorro();
        }else if(especie.equalsIgnoreCase("gato")){
            return new Gato();
        } else {
            throw new IllegalArgumentException("Espécie de animal não existente.");
        }
    }
}
