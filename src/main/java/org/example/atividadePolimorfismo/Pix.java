package org.example.atividadePolimorfismo;

public class Pix implements MeioDePagamento {
    @Override
    public void pagar(double valor){
        System.out.printf("Pagando com o pix o valor de %.2f. \n", valor);
    }
}
