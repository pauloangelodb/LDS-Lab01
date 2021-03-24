import java.util.ArrayList;

public class Secretaria extends Usuario{

    ArrayList<Curso> semestre = new ArrayList<Curso>();
    static int matricula = 0;
    
    //Construtor da classe Secretaria
    public Secretaria(int matricula, String senha, String nome, int origem) {
        this.setMatricula(matricula);
        this.setSenha(senha);
        this.setNome(nome);
        this.setOrigem(origem);
    }


    public int criarNumMatricula(){
        matricula ++;
        return matricula;
    }

    //Inscreve os cursos ofertados para o semestre
    public boolean inserirCurso(Curso novoCurso){
        for (Curso curso : semestre) {
            if (curso.getId() == novoCurso.getId())
                return false;
            else
                return(semestre.add(novoCurso));
        }
          
        return false;
    }
    
  public void removerCurso(Curso curso) {
    semestre.remove(curso);
  }
}
