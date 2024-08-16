package br.edu.umfg.isp.legado;

public class AlunoPresencial {
    private String ra;
    private String nome;
    private Double notaFinal;

    public AlunoPresencial(String ra, String nome, Double notaFinal) {
        this.ra = ra;
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }
}
