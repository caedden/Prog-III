package br.edu.umfg.ISPP.Refatorado;

public abstract class AbsConta implements  IcontaRefatorada{
    private String documento;
    private String nome;
    private  Double saldo;

    public AbsConta(String documento, String nome) {
        this.documento = documento;
        this.nome = nome;
    }

    @Override
    public void creditar(Double valor){
        this.saldo += valor;
    }
    @Override
    public void debitar(Double valor){
        this.saldo -= valor;
    }
    @Override
    public  Double getSaldo(){
        return this.saldo;
    }
}
