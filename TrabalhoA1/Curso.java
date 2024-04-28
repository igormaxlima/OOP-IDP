import java.util.UUID;
import java.util.List;
import java.util.ArrayList;

public class Curso { 
  private final UUID id;
  private String nome;
  private List<Disciplina> disciplinas;

  public Curso(String nome) { 
    this.id = UUID.randomUUID();
    this.nome = nome;
    disciplinas = new ArrayList<>();
  }

  public UUID getId() { 
    return id;
  }

  public String getNome() { 
    return nome;
  }

  public List<Disciplina> getDisciplinas() { 
    return disciplinas;
  }

  public void adicionarDisciplina(Disciplina disciplina) {
    disciplinas.add(disciplina);
  }

}