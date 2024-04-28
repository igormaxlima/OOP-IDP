import java.util.List;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	    
	    // Disciplinas
		Disciplina poo = new Disciplina("POO");
		Disciplina ed = new Disciplina("Estrutura de Dados");

		Disciplina bi = new Disciplina("Bi");
		
		
		// Professores
		Professor mia = new Professor("Mia", poo);
		Professor saulo = new Professor("Saulo", ed);
		Professor paula = new Professor("Paula", bi);
		
		
		// Cursos
		Curso ti = new Curso("TI");
		Curso adm = new Curso("ADM");
		
		ti.adicionarDisciplina(poo);
		ti.adicionarDisciplina(ed);
		adm.adicionarDisciplina(bi);
		
		
		// Alunos 
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno("Alfredo", ti));
		alunos.add(new Aluno("Amélia", ti));
    alunos.add(new Aluno("Ana", adm));
    alunos.add(new Aluno("Bruno", ti));
    alunos.add(new Aluno("Bentinho", adm));
    alunos.add(new Aluno("Capitú", ti));
    alunos.add(new Aluno("Debra", ti));
    alunos.add(new Aluno("Ian", adm));
    alunos.add(new Aluno("Iracema", ti));
    alunos.add(new Aluno("Joelmir", adm));
    alunos.add(new Aluno("Julieta", ti));
    alunos.add(new Aluno("Luana", adm));
    alunos.add(new Aluno("Luciana", ti));
    alunos.add(new Aluno("Majô", adm));
    alunos.add(new Aluno("Maria", adm));
    alunos.add(new Aluno("Norberto", ti));
    alunos.add(new Aluno("Paulo", adm));
    alunos.add(new Aluno("Romeu", adm));
    alunos.add(new Aluno("Wendel", ti));
    alunos.add(new Aluno("Zoey", ti));


    // Turmas (inicalizadas com alunos vazios, pois ensalamento ira preencher)
    List<Turma> turmas = new ArrayList<>();
    turmas.add(new Turma(mia, mia.getDisciplina()));
    turmas.add(new Turma(saulo, saulo.getDisciplina()));
    turmas.add(new Turma(paula, paula.getDisciplina()));

    // Ensalamento
    Ensalamento.setEnsalamento(turmas, alunos);
    Ensalamento.showEnsalamento(turmas);
	}
}
