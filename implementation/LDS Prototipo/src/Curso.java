import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

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

  public Curso(int id, String nome, int creditos, ArrayList<Disciplina> disciplinas){
    this.setNome(nome);
    this.setCreditos(creditos);
    this.setID(id);
    this.disciplinas = disciplinas;
  }

  public Curso() {
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
  protected void setDisciplina(Disciplina disciplina) { this.disciplinas.add(disciplina); }

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

  public String toCsv (){
    return (this.getNome() +  ";" + this.getCreditos() +  ";" + this.getId() +  ";" + this.getInicioMatricula() +  ";" +  this.getFimMatricula() +  ";" + this.getDisciplinas().stream().map(String::valueOf).collect(Collectors.joining(",")) + ";");
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
  
  public void cancelarMatricula(Aluno aluno, int idDisciplina) {
    //Buscar a disciplina que o aluno será desmatriculado;
    int indiceDisciplina = buscarIndiceDisciplina(idDisciplina);

    //matricular na disciplina
    disciplinas.get(indiceDisciplina).removerAluno(aluno);
  }

  public void listarDisciplinas(){
    System.out.println("Disciplinas do curso de "+nome+":");
    for (Disciplina disciplina : disciplinas) { 
      System.out.println("- "+disciplina.getNome()+"\n");
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