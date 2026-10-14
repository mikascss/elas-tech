package org.example.petshop;

public class Gato extends Pet {
    @Override
    protected void emitirSom(){
        System.out.println(super.nome + " diz: Miau");
    }
}
