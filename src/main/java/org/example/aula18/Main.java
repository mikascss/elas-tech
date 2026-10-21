package org.example.aula18;

public class Main {
    public static void main(String[] args) {
        Brinquedo hotwheels = new Brinquedo();
        hotwheels.nome = "Hotwheels";
        hotwheels.tipo = "carrinho";
        hotwheels.verBrinquedo(hotwheels);

        Bebe aurora = new Bebe("Aurora", "19/07/2005");
    }
}
