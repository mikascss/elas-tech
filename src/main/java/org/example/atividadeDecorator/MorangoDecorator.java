package org.example.atividadeDecorator;

public class MorangoDecorator extends AcaiDecorator {

    public MorangoDecorator(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + " + Morango";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 4.00;
    }
}
