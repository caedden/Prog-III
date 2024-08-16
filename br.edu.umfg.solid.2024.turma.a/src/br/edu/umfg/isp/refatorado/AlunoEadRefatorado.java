package br.edu.umfg.isp.refatorado;

public class AlunoEadRefatorado extends AbstractAluno{
    private String email;
    private String senha;
    public AlunoEadRefatorado(String nome, String ra, Double nota,String email, String senha) {
        super(nome, ra, nota);
        this.email = email;
        this.senha=senha;
    }
}
