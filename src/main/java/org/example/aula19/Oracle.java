package org.example.aula19;

public class Oracle implements BancoDeDados {
    int numero;

    public void chamarBanco(){
        System.out.println("Chamando Oracle");
    }

    public int getNumero(){
        return numero;
    }
}
