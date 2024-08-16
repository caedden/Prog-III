package br.edu.umfg.ISPP;

public interface Iconta {
    void creditar(Double valor);
    void debitar (Double valor);
    Double getSaldo();
}
