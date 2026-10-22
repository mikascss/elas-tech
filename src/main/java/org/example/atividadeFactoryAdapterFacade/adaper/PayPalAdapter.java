package org.example.atividadeFactoryAdapterFacade.adaper;

public class PayPalAdapter implements Pagamento {
    private PayPalAPI payPalAPI;

    public PayPalAdapter(PayPalAPI payPalAPI){
        this.payPalAPI = payPalAPI;
    }

    @Override
    public void pagar(){
        payPalAPI.sendPayment();
    }
}
