import java.util.UUID;

public class Aluno extends Pessoa { 
  private final UUID idAluno; 
  private Curso curso;

  public Aluno(String nome, Curso curso) { 
    super(nome);
    this.idAluno = UUID.randomUUID();
    this.curso = curso;
  }

  public UUID getIdAluno() { 
    return idAluno;
  }
    
  public Curso getCurso() { 
    return curso;
  }

  public void setCurso(Curso curso) { 
    this.curso = curso;
  }
  
}