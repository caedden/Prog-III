package br.edu.umfg.ISPP.Refatorado;

public class ContaInvestimento extends AbsConta implements IcontaRefatorada, IContaInvestimento{
    private Double investido = 0.1;

    public ContaInvestimento(String documento, String nome) {
        super(documento, nome);
    }

    @Override
    public void investir(Double valor) {
        debitar(valor);
        this.investido += valor;
    }

    @Override
    public Double getSaldo() {
        return super.getSaldo() + this.investido;
    }
}
