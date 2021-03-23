import java.time.LocalDate;
import java.util.ArrayList;

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

  public void matricularAlunoDisciplina(Aluno aluno, int idDisciplina){
    //verificar se está na data de matricula
    if(LocalDate.now().compareTo(this.fimMatricula) <= 0){
      //Buscar a disciplina que o aluno será matriculado;
      int indiceDisciplina = buscarIndiceDisciplina(idDisciplina);

      //matricular na disciplina
      disciplinas.get(indiceDisciplina).inserirAluno(aluno);
    }
    
  }
  

  public void listarDisciplinas(){
    System.out.println("Disciplinas do curso de "+nome+":");
    for (Disciplina disciplina : disciplinas) { 
      System.out.println("- "+disciplina.getNome());
    }
  }

  public int buscarIndiceDisciplina(Integer idDisciplina){
    //Busca a disciplina passada por parametro na lista de disciplina, caso não encontre retorna nullo
    Disciplina disciplinaBuscada = disciplinas.stream().filter(disciplina -> idDisciplina.equals(disciplina.getID()))
    .findAny()
    .orElse(null);

    if(disciplinaBuscada == null){
      throw new Error("Erro: a disciplina buscada não existe!");
    }
    
    return(disciplinas.indexOf(disciplinaBuscada));
  }
}