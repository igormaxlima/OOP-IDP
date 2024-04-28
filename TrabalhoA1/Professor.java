import java.util.UUID;

public class Professor extends Pessoa { 
  private final UUID idProfessor;
  private Disciplina disciplina;

  public Professor(String nome, Disciplina disciplina) { 
    super(nome);
    this.idProfessor = UUID.randomUUID();
    this.disciplina = disciplina;
  }

  public UUID getIdProfessor() { 
    return idProfessor;
  }

  public Disciplina getDisciplina() { 
    return disciplina;
  }

  public void setDisciplina(Disciplina disciplina) { 
    this.disciplina = disciplina;
  }
}