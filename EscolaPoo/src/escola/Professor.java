
package escola;

import java.util.ArrayList;


public class Professor extends Pessoa {
   private String formacaoAcademico;
    private double salario;
    
   private ArrayList<Disciplina> disciplinas;
   private ArrayList<Turma> turmas;
    
    public void aplicarAvaliacao(){
        
    }

    public String getFormacaoAcademico() {
        return formacaoAcademico;
    }

    public void setFormacaoAcademico(String formacaoAcademico) {
        this.formacaoAcademico = formacaoAcademico;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public Professor(){
        disciplinas = new ArrayList<Disciplina>();
    }
    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    
    public void excluirDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }
    public int quantidadeDisciplina(){
        return disciplinas.size();
    }
    public Disciplina getDisciplina(int posicao){
        return disciplinas.get(posicao);
    }

   
}
