package br.edu.umfg.isp.refatorado;

public abstract class AbstractAluno {
    private String Nome;
    private String ra;
    private Double nota;

    public String getNome() {
        return Nome;
    }

    public String getRa() {
        return ra;
    }

    public Double getNota() {
        return nota;
    }

    public AbstractAluno(String nome, String ra, Double nota) {
        Nome = nome;
        this.ra = ra;
        this.nota = nota;
    }
}
