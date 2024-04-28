import java.util.UUID;
import java.util.List;
import java.util.ArrayList;

public class Turma {
  private final UUID id;
  private Professor professor;
  private Disciplina disciplina;
  private List<Aluno> alunos;

  public Turma(Professor professor, Disciplina disciplina) { 
    this.id = UUID.randomUUID();
    this.professor = professor;
    this.disciplina = disciplina;
    alunos = new ArrayList<>();
  }

  public UUID getId() { 
    return id;
  }

  public Professor getProfessor() { 
    return this.professor;
  }

  public void setProfessor(Professor professor) { 
    this.professor = professor;
  }
  
  public Disciplina getDisciplina() { 
    return this.disciplina;
  }

  public void setDisciplina(Disciplina disciplina) { 
    this.disciplina = disciplina;
  }

  public List<Aluno> getAlunos() { 
    return this.alunos;
  }

  public void adicionarAluno(Aluno aluno) {
    alunos.add(aluno);
  }

}