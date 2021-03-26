import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Usuario {
    
    private int matricula;              //Número de matrícula
    private String senha;               //Senha cadastrada pala login
    private String nome;                //Nome do usuário
    private int origem;                 //0 = logoff, 1 = secretaria, 2 = professor, 3 = aluno
    private ArrayList<Integer> disciplinas = new ArrayList<Integer>();   //Disciplinas em que está vinculado

    public int getMatricula() { return this.matricula; }
    public String getSenha() { return this.senha; }
    public String getNome() { return this.nome; }
    public int getOrigem() { return this.origem; }
    public ArrayList<Integer> getDisciplinas() { return this.disciplinas; }

    protected void setMatricula(int matricula) { this.matricula = matricula; }
    protected void setSenha(String senha) { this.senha = senha; }
    protected void setNome(String nome) { this.nome = nome; }
    protected void setOrigem(int origem) { this.origem = origem; }
    protected void setDisciplina(int disciplina) { this.disciplinas.add(disciplina); }

    
    public String toCsv (){
        return (this.getMatricula() +  ";" + this.getSenha() +  ";" + this.getNome() +  ";" + this.getOrigem() +  ";" + this.getDisciplinas().stream().map(String::valueOf).collect(Collectors.joining(",")) + ";");
    }
    
    
    public Usuario(int matricula, String senha, String nome, int origem) {
        this.matricula = matricula;
        this.senha = senha;
        this.nome = nome;
        this.origem = origem;
    }
    

    public Usuario(int matricula, String senha, String nome, int origem, ArrayList<Integer> disciplinas) {
        this.matricula = matricula;
        this.senha = senha;
        this.nome = nome;
        this.origem = origem;
        this.disciplinas = disciplinas;
    }
    

    public Usuario() {
    }

    //Validação de login
    public int login (int matricula, String senha) {    
        if(this.matricula == matricula && this.senha == senha)
            return this.origem;
        else
            return 0;
    }
}
