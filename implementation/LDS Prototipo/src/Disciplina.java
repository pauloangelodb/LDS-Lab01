import java.time.LocalDate;
import java.util.ArrayList;

public class Disciplina{
  private String nome;
  private Professor professor;
  private static final int MIN_Inscritos = 3;
  private static final int MAX_Inscritos = 60;
  private boolean optativa;
  private ArrayList<Aluno> alunosMatriculados;
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

  public void getAlunosMatriculados() { 
    System.out.println("Alunos matriculados na disciplina de "+nome+": ");

    for (Aluno aluno : alunosMatriculados) {
      System.out.println(
        "Nome: "+aluno.getNome()+
       " | Matricula: "+aluno.getMatricula()+
       " | Origem: "+aluno.getOrigem() + "\n"
      );
    }
  
  }

  public int getID() { return id; }
  public Professor getProf() { return professor; }


  public void setNome(String nome) { this.nome = nome; }
  public void setOptativa(boolean optativa) { this.optativa = optativa; }
  public void setID(int id) { this.id = id; }

  public void setProf(Professor professor) {
    if(professor == null){
      this.professor = professor;
    }else{
      //Já existe professor da disciplina.
    }   
  
  }

  public boolean inserirAluno(Aluno aluno) {
    if(totalAlunos < vagas) {
      totalAlunos++;
      return(alunosMatriculados.add(aluno));
    }
    
    return false;
  }

  public ArrayList<Aluno> confirmarTurma(LocalDate dataFinalMatricula){
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
