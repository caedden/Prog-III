package br.edu.umfg.ISPP.Refatorado;

public class ContaCorrenteRefatorado  extends AbsConta implements IcontaRefatorada{
    public ContaCorrenteRefatorado(String documento, String nome) {
        super(documento, nome);
    }
}
