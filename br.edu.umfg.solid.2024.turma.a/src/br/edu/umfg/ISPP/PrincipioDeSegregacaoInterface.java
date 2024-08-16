package br.edu.umfg.ISPP;

public class PrincipioDeSegregacaoInterface {

    public static void executarLegado() {
        ContaCorrente contaCorrente = new ContaCorrente(15.00,"aaa","15634");
        ContaPoupanca contaPoupanca = new ContaPoupanca(15.00,"bbbbbb","15634");

        contaCorrente.creditar(150.56);
        contaPoupanca.creditar(150.56);

        System.out.println("CC "+contaCorrente.getSaldo());
        System.out.println("CC "+contaPoupanca.getSaldo());
    }
}
