import java.util.UUID;

public class Disciplina { 
  private final UUID id;
  private String nome;

  public Disciplina(String nome) { 
    this.nome = nome;
    this.id = UUID.randomUUID();
  }

  public String getNome() { 
    return nome;
  }

}