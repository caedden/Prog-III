package br.edu.umfg.isp;

import br.edu.umfg.isp.legado.AlunoEad;
import br.edu.umfg.isp.legado.AlunoPresencial;
import br.edu.umfg.isp.refatorado.AbstractAluno;
import br.edu.umfg.isp.refatorado.AlunoEadRefatorado;
import br.edu.umfg.isp.refatorado.AlunoPresencialRefatorado;

public class PrincipioDeSubstituicaoDeLiskov {
    public static void executarLegado(){
        AlunoEad aa= new AlunoEad("10","aaaaa",8.7, "a@a","11234");
        AlunoPresencial bb = new AlunoPresencial("14","ssss",9.0);
        System.out.println("RA|| NOME|| NOTA FINAL");
        System.out.println(bb.getRa()+" "+bb.getNome()+" "+bb.getNotaFinal());
        System.out.println(aa.getRa()+" "+aa.getNome()+" "+aa.getNotaFinal());
    }
    public  static  void executarRefatorado(){
        AlunoPresencialRefatorado aluno = new AlunoPresencialRefatorado("aaaa","45",10.0);
        AlunoEadRefatorado alino = new AlunoEadRefatorado("nome", "46", 4.0,"eeee@e","456");
        imprimir(aluno);
        imprimir(alino);

    }
    public static  void imprimir(AbstractAluno aluno){
        System.out.println(aluno.getRa()+" "+aluno.getNome()+" "+aluno.getNota());
    }
}
