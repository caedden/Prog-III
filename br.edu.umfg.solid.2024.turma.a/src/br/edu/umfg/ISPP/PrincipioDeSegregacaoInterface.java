package br.edu.umfg.ISPP;

import br.edu.umfg.ISPP.Legado.ContaCorrente;
import br.edu.umfg.ISPP.Legado.ContaPoupanca;
import br.edu.umfg.ISPP.Refatorado.ContaCorrenteRefatorado;
import br.edu.umfg.ISPP.Refatorado.ContaPoupacaRefatorada;

public class PrincipioDeSegregacaoInterface {

    public static void executarLegado() {
        ContaCorrente contaCorrente = new ContaCorrente(15.00,"aaa","15634");
        ContaPoupanca contaPoupanca = new ContaPoupanca(15.00,"bbbbbb","15634");

        contaCorrente.creditar(150.56);
        contaPoupanca.creditar(150.56);

        System.out.println("CC "+contaCorrente.getSaldo());
        System.out.println("CC "+contaPoupanca.getSaldo());
    }
    public static void executarRefatorado(){
        ContaCorrenteRefatorado contaCorrenteRefatorado = new ContaCorrenteRefatorado("155","aaaaa");
        ContaPoupacaRefatorada contaPoupacaRefatorada = new ContaPoupacaRefatorada("aaaa","wwwwwwwww");
        contaPoupacaRefatorada.creditar(45.68);
        contaCorrenteRefatorado.creditar(150.650);
        System.out.println("CC"+contaCorrenteRefatorado.getSaldo());
        System.out.println("CP"+contaPoupacaRefatorada.getSaldo());

    }
}
