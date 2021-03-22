import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Curso{
  private String nome;
  private int creditos;
  private int id;
  private LocalDate inicioMatricula;
  private LocalDate fimMatricula;
  private ArrayList<Disciplina> disciplinas;

  public Curso(String nome, int creditos, int id){
    this.setNome(nome);
    this.setCreditos(creditos);
    this.setID(id);
  }

  public String getNome(){ return nome; }
  public int getCreditos(){ return creditos; }
  public int getId(){ return id; }
  public LocalDate getInicioMatricula() { return inicioMatricula; }
  public LocalDate getFimMatricula() { return fimMatricula; }
  public ArrayList<Disciplina> getDisciplinas(){ return disciplinas; }

  public void setNome(String nome) { this.nome = nome; }
  public void setCreditos(int creditos) { this.creditos = creditos; }
  public void setID(int id) { this.id = id; }

  public boolean inserirDisciplina(Disciplina disciplina){
    return (disciplinas.add(disciplina));
  }

  public void definirPeriodoMatricula(LocalDate inicio, LocalDate fim){
    if(inicio.compareTo(fim) <= 0){
      inicioMatricula = inicio;
      fimMatricula = fim;
    }
    else{ 
      //erro a data de inicio não pode ser posterior ao fim.
    }
  }

  public void matricularAlunoDisciplina(int matriculaAluno, int idDisciplina){
    //verificar se está na data de matricula
    if(LocalDate.now().compareTo(this.fimMatricula) <= 0){
      // verificar se a disciplina existe
      if(disciplina.getID() != null){
        //se existe matricular
        disciplina.inserirAluno(matriculaAluno);
      }
    }
  }

  public void listarDisciplinas(){
    System.out.println("Disciplinas do curso de "+nome+":");
    for (Disciplina disciplina : disciplinas) { 
      System.out.println("- "+disciplina.getNome());
    }
  }
}