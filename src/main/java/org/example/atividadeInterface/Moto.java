package org.example.atividadeInterface;

public class Moto implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Acelerando a moto");
    }

    @Override
    public void ligar(){
        System.out.println("Ligando a moto");
    }
}
