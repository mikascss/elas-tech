package org.example.atividadeInterface;

import java.util.ArrayList;
import java.util.List;

public class Executar {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();

        Animal bidu = new Cachorro();
        Animal salem = new Gato();

        bidu.emitirSom();
        salem.emitirSom();

        List<Animal> animais = new ArrayList<>();
        animais.add(bidu);
        animais.add(salem);
        animais.forEach(Animal::emitirSom);

        List<Notificacao> notificacoes = new ArrayList<>(List.of(new Email(), new SMS()));
        notificacoes.forEach(notificacao -> notificacao.enviar("teste de notificação"));

        List<Veiculo> veiculos = new ArrayList<>(List.of(new Moto(), new Carro()));
        for(Veiculo veiculo : veiculos){
            veiculo.ligar();
            veiculo.acelerar();
        }
    }
}
