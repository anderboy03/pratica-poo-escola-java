/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escolapoo;

import escola.Disciplina;
import escola.Professor;

/**
 *
 * @author User
 */
public class AssociacaoMuitosParaMuitos {
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setCargaHoraria(80);
        disciplina1.setNome("matematica");
        
        
        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("Portugues");
        disciplina2.setCargaHoraria(60);
        
        Professor professor1 = new Professor();
        professor1.setNome("matheus");
        professor1.setMatricula(123);
        professor1.setFormacaoAcademico("licenciado");
        professor1.setSalario(10);
        
        professor1.adicionarDisciplina(disciplna1);
        disciplina1.adicionarProfessor(professor2);
        
    }
    
}
