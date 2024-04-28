import java.util.Collection;

public class Ensalamento { 
    
    public static void setEnsalamento(Collection<Turma> turmas, Collection<Aluno> alunos) {
      for (Turma turma : turmas) {
        Disciplina disciplinaTurma = turma.getDisciplina();
    
        for (Aluno aluno : alunos) {
          Curso cursoAluno = aluno.getCurso();
    
          for (Disciplina disciplinaCurso : cursoAluno.getDisciplinas()) {
            if (disciplinaCurso.equals(disciplinaTurma)) {
              turma.adicionarAluno(aluno);
              break;
            }
          }
        }
      }
    }
    
    public static void showEnsalamento(Collection<Turma> turmas) {
      System.out.println("------- Ensalamento de Turmas -------");
    
      for (Turma turma : turmas) {
        System.out.println("\n");
        System.out.println("**  Turma: " + turma.getDisciplina().getNome() + " - Professor(a): " + turma.getProfessor().getNome() + "  **");
        System.out.println("Alunos:");
        for (Aluno aluno : turma.getAlunos()) {
          System.out.println("- " + aluno.getNome());
        }
      }
    }
}