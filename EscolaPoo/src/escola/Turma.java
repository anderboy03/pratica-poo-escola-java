
package escola;

import java.util.ArrayList;


public class Turma {
   private String sigla;
   private int ano;
    
    
   private ArrayList<Aluno> alunos;
   private ArrayList<Professor>professores;
   private ArrayList<Disciplina>disciplina;
   
   public Turma(){
       alunos = new ArrayList<Aluno>();
   }
   
   //adicionar alunos
   
   public void adicionarAluno(Aluno aluno){
       alunos.add(aluno);
   }
   //quantidades de alunos
   public int  quantidadeAlnos(){
       return alunos.size();
   }
   //excluir aluno
   public void excluirAluno(Aluno aluno){
       alunos.remove(aluno);
   }
   
   public Aluno getAluno(int posicao){
       return alunos.get(posicao);
       
   }
   
    
    void adicionarAluno(){
        
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
