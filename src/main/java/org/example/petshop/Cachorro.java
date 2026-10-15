package org.example.petshop;

public class Cachorro extends Pet {
    @Override
    protected void emitirSom(){
        System.out.println(super.getNome() + " diz: Au Au");
    }
}
