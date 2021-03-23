import java.util.ArrayList;

public class Aluno extends Usuario {
    private ArrayList<Disciplina> disciplinasEmCurso;
    private ArrayList<Disciplina> historicoDeDisciplinas;
    
    public ArrayList<Disciplina> getDisciplinasEmCurso() { return disciplinasEmCurso; }
    public ArrayList<Disciplina> getHistorico() { return historicoDeDisciplinas; }
    
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
        //apos matricular na disciplina, inserir a disciplina nas "Disciplinas em curso pelo aluno"

    }

    public void cancelarMatricula(int idDisciplina) {

        /* IMPLEMENTAR CHAMADA DA CLASSE CURSO */
        curso.cancelarMatricula(this.getMatricula(), idDisciplina);
    }

    public void addDisciplinaHistorico(Disciplina disciplina){
        //depois de ter cursado a disciplina, a mesma vai para o historico do aluno.
        historicoDeDisciplinas.add(disciplina);
    }
}
