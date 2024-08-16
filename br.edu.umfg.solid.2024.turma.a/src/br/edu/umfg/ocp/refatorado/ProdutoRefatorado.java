package br.edu.umfg.ocp.refatorado;

import java.util.ArrayList;

public class ProdutoRefatorado {
    private String descricao;
    private Double valor;
    private ArrayList<AbstractImpostoEstadual> impostoEstaduals
            = new ArrayList<AbstractImpostoEstadual>();
    private ArrayList<AbstractImpostoFederal> impostoFederals
            = new ArrayList<AbstractImpostoFederal>();

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public ProdutoRefatorado(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
        this.impostoEstaduals.addAll(impostoEstaduals);
        this.impostoFederals.addAll(impostoFederals);
    }

    public void addImpostosFeredais(AbstractImpostoFederal imposto){
        this.impostoFederals.add(imposto);
    }
    public void removeImpostoFederal(AbstractImpostoFederal imposto){
        this.impostoFederals.add(imposto);
    }

    public void addImpostosEstadual(AbstractImpostoEstadual imposto){
        this.impostoEstaduals.add(imposto);
    }
    public void removeImpostoEstadual(AbstractImpostoEstadual imposto){
        this.impostoEstaduals.add(imposto);
    }

    public Double getValorImpostoFederais(TipoEstado tipoEstado){
        return  0.0;
    }
    double totalImpostos;
    final Double totalImpostosFinal[]={0.0};
    public Double getValorImpostoEstaduais(TipoEstado tipoEstado) {
       for(int i = 0; i <this.impostoEstaduals.size();i++){
           if(tipoEstado.equals((this.impostoEstaduals.get(i)))){
                totalImpostos   = (this.valor / 100) * this.impostoEstaduals.get(i).getAliquota();
           }
       }
       this.impostoEstaduals
               .stream()
               .filter(x -> tipoEstado.equals(x.getTipoEstado())).forEach(y -> {totalImpostosFinal[0] += ((this.valor-100) * y.getAliquota());});
        return 0.0;
    }

    public Double getValorImpostosFedrais() {
        final Double totalIMpostos[] = {0.0};
        this.impostoFederals
                .forEach(x  -> {totalImpostosFinal[0] += (this.valor-100);});
                return totalImpostos;
    }
}


