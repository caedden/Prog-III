package br.edu.umfg.ISPP.Legado;

public interface Iconta {
    void creditar(Double valor);
    void debitar (Double valor);
    Double getSaldo();
}
