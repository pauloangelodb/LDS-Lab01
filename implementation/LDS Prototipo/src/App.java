public class App {

    public static void Inicializador() {
        Secretaria secretaria = new Secretaria(0, "1234", "Secretaria", 1);
        Professor iniProfessor = new Professor(secretaria.criarNumMatricula(), "senha", "Default Prof", 2);
        Professor iniAluno = new Professor(secretaria.criarNumMatricula(), "senha", "Default Aluno", 3);
    }

    private static int TelaLogin() {
        int origem = 0, matricula;
        String senha;

        System.out.println("\n TELA DE LOGIN \n");
        while ((origem != 1)||(origem != 2)||(origem != 3)){
            System.out.println("\n Digite:\n 1 = Secretaria\n 2 = Professor(a)\n 3 = Aluno(a)");
            //recebe valor para origem
        }        
        System.out.println("\n Digite sua matrícula:\n");
        //recebe valor de matrícula
        System.out.println("\n Digite sua senha:\n");
        //recebe valor de senha

        switch(origem){
            case 1:
                if((secretaria.getMatricula() == matricula) && (secretaria.getSenha() == senha)){
                        //login confirmado
                        return origem;
                }
                else
                    System.out.println("Erro: matrícula e/ou senha incorretos.\n");
            break;
            case 2:
                if((professor.getMatricula() == matricula) && (professor.getSenha() == senha)){
                        //login confirmado
                        return origem;
                }
                else
                    System.out.println("Erro: matrícula e/ou senha incorretos.\n");
            break;
            case 3:
                if((aluno.getMatricula() == matricula) && (aluno.getSenha() == senha)){
                        //login confirmado
                        return origem;
                }
                else
                    System.out.println("Erro: matrícula e/ou senha incorretos.\n");
            break;
            default:
                System.out.println("Login não efetuado");
                return 0;
            break;
        }

        if(origem == -1){
            System.out.println("Erro: matrícula e/ou senha incorretos.\n");
            return 0;
        }
    }

    private static void TelaSecretaria() {
        System.out.println("\n TELA DA SECRETARIA \n");
    }

    private static void TelaProfessor() {
        System.out.println("\n TELA DO PROFESSOR \n");
    }

    private static void TelaAluno() {
        System.out.println("\n TELA DO ALUNO \n");
    }

    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        Inicializador();

        while (true){           
            
            switch(TelaLogin()){
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
