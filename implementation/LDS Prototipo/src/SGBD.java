<<<<<<< Updated upstream
//import java.util.*;
=======
//import java.io.FileWriter;
//import java.io.IOException;
import java.util.*;
>>>>>>> Stashed changes
import java.io.*;
import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

public class SGBD {

    //private final static String arqUsuarios = "Usuario.txt";


    public static void InserirUsuarios() throws IOException {
        File dir = new File("F:\\ESCOLA\\EAD\\Lab Soft\\LDS-Lab01\\implementation\\LDS Prototipo\\src");
        File arquivoUsuarios = new File(dir, "Usuarios.txt");

        try {
<<<<<<< Updated upstream
            Usuario Usuario = new Usuario(1, "123", " Secretaria", 1, null);
=======
            Usuario Usuario = new Usuario();
            //Usuario Usuario = new Usuario(1, "123", " Secretaria", 1);
>>>>>>> Stashed changes
            //Usuario Usuario1 = new Usuario(2, "123", " Paulo", 3);
            //Usuario Usuario2 = new Usuario(3, "1234", "Guilherme", 3);
            //Usuario Usuario3 = new Usuario(4, "12345", "Lucas", 3);

            FileWriter fileWriter = new FileWriter(arquivoUsuarios, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            printWriter.print(Usuario.toCsv());

            printWriter.flush();
            printWriter.close();
<<<<<<< Updated upstream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void InserirDisciplina() {
        File dir = new File("F:\\ESCOLA\\EAD\\Lab Soft\\LDS-Lab01\\implementation\\LDS Prototipo\\src");
        File arquivoDisciplinas = new File(dir, "Disciplinas.txt");

        try {
            Disciplina disciplina = new Disciplina("nome", true , 1, 60);
            
            FileWriter fileWriter = new FileWriter(arquivoDisciplinas, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            printWriter.print(Disciplina.toCsv());

            printWriter.flush();

            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void InserirCurso() {
        File dir = new File("F:\\ESCOLA\\EAD\\Lab Soft\\LDS-Lab01\\implementation\\LDS Prototipo\\src");
        File arquivoUsuarios = new File(dir, "Cursos.txt");

        try {
            Usuario Usuario = new Usuario(1, "123", " Secretaria", 1, null);
            

            FileWriter fileWriter = new FileWriter(arquivoUsuarios, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            printWriter.print(Usuario.toCsv());

            printWriter.flush();

            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void LerUsuario(){

        File dir = new File("F:\\ESCOLA\\EAD\\Lab Soft\\LDS-Lab01\\implementation\\LDS Prototipo\\src");
        File arquivoUsuarios = new File(dir, "Usuarios.txt");

        try {
            FileReader fileReader = new FileReader(arquivoUsuarios);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";

            List<String> result = new ArrayList<>();

            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
                if (linha != null && !linha.isEmpty()) {
                    result.add(linha);
                }
            }

            fileReader.close();
            bufferedReader.close();

            for (String s : result) {
                String[] user = s.split(";");

                Usuario u = new Usuario();
                u.setMatricula(Integer.valueOf(user[0]));
                u.setSenha(user[1]);
                u.setNome(user[2]);
                u.setOrigem(Integer.valueOf(user[3]));
                u.setDisciplina(Integer.valueOf(user[4]));

                System.out.println(u.toString());
            }
        } catch (IOException e) {
=======

        } catch (IOException e) {
            System.out.println("an arror occurred");
>>>>>>> Stashed changes
            e.printStackTrace();
        }
    }

    public static void LerCurso(){
        File dir = new File("F:\\ESCOLA\\EAD\\Lab Soft\\LDS-Lab01\\implementation\\LDS Prototipo\\src");
        File arquivoCursos = new File(dir, "Cursos.txt");

        try {
            FileReader fileReader = new FileReader(arquivoCursos);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";

            List<String> result = new ArrayList<>();

            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
                if (linha != null && !linha.isEmpty()) {
                    result.add(linha);
                }
            }

            fileReader.close();
            bufferedReader.close();

            for (String s : result) {
                String[] curso = s.split(";");

                Curso c = new Curso();
                c.setID(Integer.valueOf(curso[0]));
                c.setNome(curso[1]);
                c.setCreditos(Integer.valueOf(curso[2]));
                //c.setDisciplina(Disciplina.valueOf(curso[3]));

                System.out.println(c.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void LerDisciplina(){

        File dir = new File("F:\\ESCOLA\\EAD\\Lab Soft\\LDS-Lab01\\implementation\\LDS Prototipo\\src");
        File arquivoDisciplinas = new File(dir, "Disciplinas.txt");

        try {
            FileReader fileReader = new FileReader(arquivoDisciplinas);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";

            List<String> result = new ArrayList<>();

            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
                if (linha != null && !linha.isEmpty()) {
                    result.add(linha);
                }
            }

            fileReader.close();
            bufferedReader.close();

            for (String s : result) {
                String[] disciplina = s.split(";");

                Disciplina d = new Disciplina();
                d.setID(Integer.valueOf(disciplina[0]));
                d.setNome(disciplina[1]);
                d.setOptativa(Boolean.valueOf(disciplina[2]));
                //d.setProf(Professor.valueof(disciplina[3]));

                System.out.println(d.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void CriarUsuario(){
        try {
            // Criando arquivo de texto para armazenamento de Usuários
            java.io.File arquivoUsuarios = new java.io.File("F:\\ESCOLA\\EAD 2.0\\Lab Soft\\LDS-Lab01\\implementation\\LDS Prototipo\\src\\Usuarios.txt");

            if(arquivoUsuarios.createNewFile()){
                System.out.println("File created: " + arquivoUsuarios.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("an arror occurred");
            e.printStackTrace();
        }
    }

    public static void CriarDisciplina(){
        try {
            // Criando arquivo de texto para armazenamento de Usuários
            java.io.File arquivoDisciplinas = new java.io.File("F:\\ESCOLA\\EAD 2.0\\Lab Soft\\LDS-Lab01\\implementation\\LDS Prototipo\\src\\Disciplinas.txt");

            if(arquivoDisciplinas.createNewFile()){
                System.out.println("File created: " + arquivoDisciplinas.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("an arror occurred");
            e.printStackTrace();
        }
    }

    public static void CriarCurso(){
        try {
            // Criando arquivo de texto para armazenamento de Usuários
            java.io.File arquivoCursos = new java.io.File("F:\\ESCOLA\\EAD 2.0\\Lab Soft\\LDS-Lab01\\implementation\\LDS Prototipo\\src\\Cursos.txt");

            if(arquivoCursos.createNewFile()){
                System.out.println("File created: " + arquivoCursos.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("an arror occurred");
            e.printStackTrace();
        }
    }

    //Criando usuario no arquivo
    /*public static void CriarUsuario(int matricula, String senha, String nome, int origem){
        Usuario Usuario = new Usuario(matricula , senha, nome, origem);
        
    }*/
}

    /* Criando arquivo de texto para armazenamento de 
    java.io.File arquivo = new java.io.File("LDS-Lab01\\implementation\\LDS_Prototipo\\src\\.txt");
    if (arquivo.createNewFile()) {
      System.out.println("File created: " + arquivo.getName());
    } else {
      System.out.println("File already exists.");
    }*/
    