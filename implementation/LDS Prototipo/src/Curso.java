import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Curso{
  private String nome;
  private int creditos;
  private int id;
  private Date inicioMatricula;
  private Date fimMatricula;
  private ArrayList<Disciplina> disciplinas;

  public Curso(String nome, int creditos, int id){
    this.nome = nome;
    this.creditos = creditos;
    this.id = id;
  }

  public String getNome(){ return nome; }
  public int getCreditos(){ return creditos; }
  public int getId(){ return id; }
  public Date getInicioMatricula() { return inicioMatricula; }
  public Date getFimMatricula() { return fimMatricula; }
  public ArrayList<Disciplina> getDisciplinas(){ return disciplinas; }

  public void setNome(String nome) { this.nome = nome; }
  public void setCreditos(int creditos) { this.creditos = creditos; }
  public void setID(int id) { this.id = id; }

  public boolean inserirDisciplina(Disciplina disciplina){
    return (disciplinas.add(disciplina));
  }

  public void definirPeriodoMatricula(Date inicio, Date fim){
    if(inicio.compareTo(fim) <= 0){
      inicioMatricula = inicio;
      fimMatricula = fim;
    }
    else{ 
      //erro a data de inicio não pode ser posterior ao fim.
    }
  }

  public void matricularAlunoDisciplina(Integer matriculaAluno, int idDisciplina){
    //verofocar se está na data de matricula
      // verificar se a disciplina existe
        //se existe matricular (discipla.inserirAluno(matriculaAluno))
    
  }

  public void listarDisciplinas(){
    System.out.println("Disciplinas do curso de "+nome+":");
    for (Disciplina disciplina : disciplinas) { 
      System.out.println("- "+disciplina.getNome());
    }
  }

  


} 