package org.example.atividadePolimorfismo;

public class Boleto implements MeioDePagamento {
    @Override
    public void pagar(double valor){
        System.out.printf("Pagando com o boleto o valor de %.2f. \n", valor);
    }
}
