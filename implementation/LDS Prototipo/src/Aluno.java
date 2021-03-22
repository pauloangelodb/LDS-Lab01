import java.util.ArrayList;

public class Aluno extends Usuario {
    
    //Construtor da classe Aluno
    public Aluno(int matricula, String senha, String nome, int origem) {
        this.setMatricula(matricula);
        this.setSenha(senha);
        this.setNome(nome);
        this.setOrigem(origem);
    }

    public void matricular(int idDisciplina) {

        /* IMPLEMENTAR CHAMADA DA CLASSE CURSO */
        curso.matricularAlunoDisciplina(this.getMatricula(), idDisciplina);

    }

    public void cancelarMatricula(int idDisciplina) {

        /* IMPLEMENTAR CHAMADA DA CLASSE CURSO */
        curso.cancelarMatricula(this.getMatricula(), idDisciplina);
    }
}
