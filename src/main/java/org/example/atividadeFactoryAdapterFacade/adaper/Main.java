package org.example.atividadeFactoryAdapterFacade.adaper;

public class Main {
    public static void main(String[] args) {

//        Pagamento pagamento = new PayPalAPI();

        Pagamento pagamento = new PayPalAdapter(new PayPalAPI());

        pagamento.pagar();

    }
}
