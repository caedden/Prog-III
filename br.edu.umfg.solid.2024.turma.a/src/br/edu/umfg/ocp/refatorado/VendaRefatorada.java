package br.edu.umfg.ocp.refatorado;

import java.util.ArrayList;

public class VendaRefatorada {
    private TipoEstado tipoEstado;
    private ArrayList<ProdutoRefatorado> produtos = new ArrayList<ProdutoRefatorado>();

    public void VendaRefatorada(TipoEstado tipoEstado){
        this.tipoEstado = tipoEstado;
    }

    public void addRefatorada(ProdutoRefatorado produto){
        this.produtos.add(produto);
    }

    public void removeProduto(ProdutoRefatorado produto){
        this.produtos.remove(produto);
    }

    @Override
    public String toString(){
        final String retorno[] = { "" };
        final Double totalProdutos[]={0.0};
        final Double totalImpostos[]={0.0};
        retorno[0]="Estado Venda: "+ this.tipoEstado +"/n";
        this.produtos
                .stream().forEach(x -> {Double valorProduto =x.getValor();
                Double impostosFederais = x.getValorImpostosFedrais();
                Double impostosEstaduais = x.getValorImpostoEstaduais(this.tipoEstado);
                retorno[0] += x.getDescricao() + " | " + valorProduto + " | " + impostosEstaduais + " " + impostosFederais;
                });

        retorno[0] += totalProdutos[0]+"/n";
        retorno[0] += totalImpostos[0]+"/n";
        retorno[0] += (totalProdutos[0]+totalImpostos[0])+"/n";
        return retorno[0];
    }

}
