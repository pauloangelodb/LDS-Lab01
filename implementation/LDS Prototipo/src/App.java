import java.util.Scanner;

public class App {

    public static Secretaria secretaria;
    public static Professor iniProfessor;
    public static Aluno iniAluno;

    public static Scanner ler = new Scanner(System.in);

    public static void Inicializador() {
        secretaria =   new Secretaria(0, "1234", "Secretaria", 1);
        iniProfessor = new Professor(secretaria.criarNumMatricula(), "senha", "Default Prof", 2);
        iniAluno =     new Aluno(secretaria.criarNumMatricula(), "senha", "Default Aluno", 3);
    }

    private static int TelaLogin() {
        int origem = 0, matricula;
        String senha;

        System.out.println("\n TELA DE LOGIN \n");
        while ((origem != 1) && (origem != 2) && (origem != 3)){
            System.out.println("Digite:\n 1 = Secretaria\n 2 = Professor(a)\n 3 = Aluno(a)");
            //recebe valor para origem
            origem = ler.nextInt();
        }

        System.out.println("\n Digite sua matrícula:\n");
        //recebe valor de matrícula
        matricula = ler.nextInt();

        System.out.println("\n Digite sua senha:\n");
        //recebe valor de senha
        senha = ler.next();

        switch(origem){
            case 1:
                if((secretaria.getMatricula() == matricula) && (secretaria.getSenha() == senha)){
                        //login confirmado
                        origem = 1;
                }
                else
                    System.out.println("Erro: matrícula e/ou senha incorretos.\n");
            break;
            case 2:
                if((iniProfessor.getMatricula() == matricula) && (iniProfessor.getSenha() == senha)){
                        //login confirmado
                        origem = 2;
                }
                else
                    System.out.println("Erro: matrícula e/ou senha incorretos.\n");
            break;
            case 3:
                if((iniAluno.getMatricula() == matricula) && (iniAluno.getSenha() == senha)){
                        //login confirmado
                        origem = 3;
                }
                else
                    System.out.println("Erro: matrícula e/ou senha incorretos.\n");
            break;
            default:
                System.out.println("Login não efetuado");
                origem = 0;
        }

        if(origem == -1){
            System.out.println("Erro: matrícula e/ou senha incorretos.\n");
            origem = 0;
        }
        
        return origem;
    }

    private static void TelaSecretaria() {
        int menu = 0, matricula, creditos;
        String nome;
        System.out.println("\n TELA DA SECRETARIA \n");

        while(menu != 3){            
            while ((menu != 1) && (menu != 2) && (menu != 3)){
                System.out.println("Digite:\n 1 = Inserir Curso\n 2 = Remover Curso\n 3 = Sair");
                //recebe valor para origem
                menu = ler.nextInt();
            }

            switch (menu){
                case 1:
                    //Inserir curso
                    System.out.println("Digite o nome do curso:\n");
                    nome = ler.next();
                    System.out.println("Digite o total de créditos do curso:\n");
                    creditos = ler.nextInt();

                    Curso novoCurso = new Curso(nome, creditos, secretaria.criarNumMatricula());
                    secretaria.inserirCurso(novoCurso);

                    menu = 0;
                break;

                case 2:
                    //Remover
                    System.out.println("Digite o código do curso:\n");
                    matricula = ler.nextInt();

                    secretaria.removerCurso(matricula);

                    menu = 0;
                break;

                case 3:
                    //Sair
                    System.out.println("Desconectando...");
                break;

                default:
                    menu = 0;
            }
        }
    }

    private static void TelaProfessor() {
        int menu = 0, matricula;
        String disciplina;
        System.out.println("\n TELA DO PROFESSOR \n");

        while(menu != 3){            
            while ((menu != 1) && (menu != 2) && (menu != 3)){
                System.out.println("Digite:\n 1 = Consultar alunos em uma Disciplina\n 2 = Adicionar Disciplina que leciona\n 3 = Sair");
                //recebe valor para origem
                menu = ler.nextInt();
            }

            switch (menu){
                case 1:
                    //Consultar alunos em uma Disciplina
                    System.out.println("Digite o código de matrícula da disciplina:\n");
                    matricula = ler.nextInt();

                    professor.consultar(matricula);

                    menu = 0;
                break;

                case 2:
                    //Adicionar Disciplina que leciona
                    System.out.println("Digite o código do curso:\n");
                    matricula = ler.nextInt();
                    for (Disciplina disc : Curso.getDisciplinas()) {
                        if (disc.getID() == matricula)
                            professor.addDisciplinaLecionada(disciplina);
                    }

                    menu = 0;
                break;

                case 3:
                    //Sair
                    System.out.println("Desconectando...");
                break;

                default:
                    menu = 0;
            }
        }
    }

    private static void TelaAluno() {
        int menu = 0, curso, disciplina;
        System.out.println("\n TELA DO ALUNO \n");

        while(menu != 3){            
            while ((menu != 1) && (menu != 2) && (menu != 3)){
                System.out.println("Digite:\n 1 = Se matricular em uma Disciplina\n 2 = Desmatricular de uma Disciplina\n 3 = Exibir histórico\n 3 = Sair");
                //recebe valor para origem
                menu = ler.nextInt();
            }

            switch (menu){
                case 1:
                    //Se matricular em uma Disciplina
                    System.out.println("Digite o código do curso:\n");
                    curso = ler.nextInt();
                    System.out.println("Digite o código da disciplina:\n");
                    disciplina = ler.nextInt();

                    aluno.matricular(curso, disciplina);

                    menu = 0;
                break;

                case 2:
                    //Desmatricular de uma Disciplina
                    System.out.println("Digite o código do curso:\n");
                    curso = ler.nextInt();
                    System.out.println("Digite o código da disciplina:\n");
                    disciplina = ler.nextInt();

                    aluno.cancelarMatricula(curso, disciplina);

                    menu = 0;
                break;

                case 3:
                    //Exibir histórico
                    aluno.getHistorico();

                    menu = 0;
                break;

                case 4:
                    //Sair
                    System.out.println("Desconectando...");
                break;

                default:
                    menu = 0;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        int opcao;

        Inicializador();

        while (true){         
            
            opcao = TelaLogin();
            
            switch(opcao){
                case 1:
                    TelaSecretaria();
                break;

                case 2:
                    TelaProfessor();
                break;

                case 3:
                    TelaAluno();
                break;

                default:
                    System.out.println("Login não efetuado");
                break;
            }
        }
    }
}
