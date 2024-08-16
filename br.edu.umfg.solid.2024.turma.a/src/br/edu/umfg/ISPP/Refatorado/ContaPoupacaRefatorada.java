package br.edu.umfg.ISPP.Refatorado;

public class ContaPoupacaRefatorada extends AbsConta implements  IcontaRefatorada{
    public ContaPoupacaRefatorada(String documento, String nome) {
        super(documento, nome);
    }
}
