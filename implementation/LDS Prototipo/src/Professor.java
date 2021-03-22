import java.util.ArrayList;

public class Professor extends Usuario {
    
    //Construtor da classe Professor
    public Professor(int matricula, String senha, String nome, int origem) {
        this.setMatricula(matricula);
        this.setSenha(senha);
        this.setNome(nome);
        this.setOrigem(origem);
    }

    //Professor consulta os nomes dos alunos cadastrados em uma disciplina
    public ArrayList<Integer> consultar (Disciplina disciplina) {
        
        return disciplina.getMatriculaAlunos();
    }
}
