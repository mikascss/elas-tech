package org.example.atividadeSingleton;

public class Main {
    public static void main(String[] args) {
        ContadorVisitas pagina1 = ContadorVisitas.getInstancia();
        ContadorVisitas pagina2 = ContadorVisitas.getInstancia();

        System.out.println("Antes pagina1: " + pagina1.getTotal());
        System.out.println("Antes pagina2: " + pagina2.getTotal());

        pagina1.registrarVisita();
        System.out.println("Registrada visita com pagina1: " + pagina1.getTotal());
        pagina2.registrarVisita();
        System.out.println("Registrada visita com pagina2: " + pagina2.getTotal());


        // Questão 7

        Carrinho telaProdutos = Carrinho.getInstancia();
        Carrinho telaPromocoes = Carrinho.getInstancia();

        telaProdutos.adicionarItem();
        telaPromocoes.adicionarItem();

        System.out.println("Quantidade final telaProdutos: " + telaProdutos.getQuantidadeItens());
        System.out.println("Quantidade final telaPromocoes: " + telaPromocoes.getQuantidadeItens());
    }
}
