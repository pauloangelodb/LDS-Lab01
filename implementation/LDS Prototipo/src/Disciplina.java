import java.util.ArrayList;

public class Disciplina{
  private String nome;
  private int minInscritos=3;
  private int maxInscritos=60;
  private boolean optativa;
  private ArrayList<Integer> alunosMatriculados;
  private int id;
  private int vagas;

  public Disciplina(String nome, boolean optativa, int id){
    this.nome = nome;
    this.optativa = optativa;
    this.id = id;
    
  }

  public String getNome(){ return nome; } 
  public boolean getOptativa(){ return optativa; } 
  public ArrayList<Integer> getMatriculaAlunos(){ return alunosMatriculados; }
  public int getID(){ return id; }

  public void setNome(String nome) { this.nome = nome; }
  public void setOptativa(boolean optativa) { this.optativa = optativa; }
  public void setID(int id) { this.id = id; }

  public boolean inserirAluno(int matricula){
    if(vagas > 0){
      vagas--;
      return(alunosMatriculados.add(matricula));
    }
    
    return false;
  }

  public ArrayList<Integer> confirmarTurma(){
    vagas = 0;
    return alunosMatriculados;
  }


}
