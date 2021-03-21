import java.util.ArrayList;

public class Usuario {
    
    
    private int matricula;              //Número de matrícula
    private String senha;               //Senha cadastrada pala login
    private String nome;                //Nome do usuário
    private int origem;                 //0 = erro, 1 = professor, 2 = aluno
    private ArrayList<Integer> disciplinas = new ArrayList<Integer>();   //Disciplinas em que está vinculado

    public int getMatricula() {
        return this.matricula;
    }

    protected void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return this.senha;
    }

    protected void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return this.nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    public int getOrigem() {
        return this.origem;
    }

    protected void setOrigem(int origem) {
        this.origem = origem;
    }

    public ArrayList<Integer> getDisciplinas() {
        return this.disciplinas;
    }

    protected void setDisciplina(int disciplina) {
        this.disciplinas.add(disciplina);
    }
    
    /*
    public Usuario(int matricula, String senha, String nome, int origem) {
        this.matricula = matricula;
        this.senha = senha;
        this.nome = nome;
        this.origem = origem;
    }
    */

    //Validação de login
    public int login (int matricula, String senha) {    
        if(this.matricula == matricula && this.senha == senha)
            return this.origem;
        else
            return 0;
    }
    

}
