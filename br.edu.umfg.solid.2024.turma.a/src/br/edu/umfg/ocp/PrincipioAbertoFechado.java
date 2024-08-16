package br.edu.umfg.ocp;

import br.edu.umfg.ocp.legado.Produto;
import br.edu.umfg.ocp.legado.TipoDeVenda;
import br.edu.umfg.ocp.legado.Venda;
import br.edu.umfg.ocp.refatorado.*;

public class PrincipioAbertoFechado {
    public static void executarLegado(){
        Produto cocaCola =
                new Produto("COCA COLA 350 ML",
                        7.50);
        Produto batataFrita =
                new Produto ("BATATA FRITA 400 GR",
                        29.00);

        Venda venda
                = new Venda(TipoDeVenda.Parana);

        venda.addProduto(cocaCola);
        venda.addProduto(batataFrita);
        venda.removeProduto(cocaCola);
        venda.addProduto(cocaCola);
        venda.addProduto(cocaCola);

        System.out.println(venda.toString());
    }

    public static void executarRefatorado(){
        IcmsParana icmsParana = new IcmsParana();
        IcmsSantaCatarina icmsSantaCatarina = new IcmsSantaCatarina();
        Pis pis = new Pis();
        VendaRefatorada venda = new VendaRefatorada();
        ProdutoRefatorado coca = new ProdutoRefatorado("COCA 350ML", 7.00);
        coca.addImpostosEstadual(icmsParana);
        System.out.println(coca.getValorImpostoEstaduais(TipoEstado.SantaCatarina));
    }


}
