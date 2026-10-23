package org.example.atividadeDecorator;

public class Main {
    public static void main(String[] args) {
        Acai acaiGranola = new GranolaDecorator(new AcaiSimples());
        System.out.println(acaiGranola.getDescricao());
        System.out.println("Preço: R$ " + acaiGranola.getPreco());


        Acai acaiCompleto = new MorangoDecorator(new GranolaDecorator(new AcaiSimples()));
        System.out.println(acaiCompleto.getDescricao());
        System.out.println("Preço: R$ " + acaiCompleto.getPreco());
    }
}
