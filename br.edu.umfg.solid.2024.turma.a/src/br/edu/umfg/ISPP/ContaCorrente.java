package br.edu.umfg.ISPP;

public class ContaCorrente implements Iconta {
    private Double saldo;
    private String nome;
    private String conta;

    public ContaCorrente(Double saldo, String nome, String conta) {
        this.saldo = saldo;
        this.nome = nome;
        this.conta = conta;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void creditar(Double valor){
        this.saldo += valor;
    }

    @Override
    public void debitar(Double valor) {
        this.saldo -= valor;
    }

}
