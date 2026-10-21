package org.example.aula19;

public class MySql implements BancoDeDados {
    int numero;

    public void chamarBanco(){
        System.out.println("Chamando o MySQL");
    }

    public int getNumero(){
        return numero;
    }
}
