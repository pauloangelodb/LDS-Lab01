import java.time.LocalDate;
import java.util.ArrayList;

public class Disciplina{
  private String nome;
  private static final int MIN_Inscritos = 3;
  private static final int MAX_Inscritos = 60;
  private boolean optativa;
  private ArrayList<Integer> alunosMatriculados;
  private int id;
  private int vagas;
  private int totalAlunos;

  public Disciplina(String nome, boolean optativa, int id, int vagas){
    this.nome = nome;
    this.optativa = optativa;
    this.id = id;

    if(vagas < MAX_Inscritos)
      this.vagas = vagas;
    else
      this.vagas = MAX_Inscritos;
  }

  public String getNome() { return nome; } 
  public boolean getOptativa() { return optativa; } 
  public ArrayList<Integer> getMatriculaAlunos() { return alunosMatriculados; }
  public int getID() { return id; }

  public void setNome(String nome) { this.nome = nome; }
  public void setOptativa(boolean optativa) { this.optativa = optativa; }
  public void setID(int id) { this.id = id; }

  public boolean inserirAluno(int matricula) {
    if(totalAlunos < vagas) {
      totalAlunos++;
      return(alunosMatriculados.add(matricula));
    }
    
    return false;
  }

  public ArrayList<Integer> confirmarTurma(LocalDate dataFinalMatricula){
    if(totalAlunos > MIN_Inscritos){
      if(LocalDate.now().compareTo(dataFinalMatricula) <= 0){
        vagas = 0;
        return alunosMatriculados;
      }
      else{
        //Retorna mensagem de erro: Prazo expirado
        return null;
      }
    }
    else{
      //Retorna mensagem de erro: Matrículas insuficientes
      return null;
    }
  }
}
