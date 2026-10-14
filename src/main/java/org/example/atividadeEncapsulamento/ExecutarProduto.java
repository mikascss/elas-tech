package org.example.atividadeEncapsulamento;

public class ExecutarProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        System.out.println(produto.nome);
        System.out.println(produto.preco);
//        System.out.println(produto.codigoInterno); java: codigoInterno has private access
//        in org.example.atividadeEncapsulamento.Produto


    }
}
