import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SGBD {

    private final static String arqUsuarios = "Usuario.txt";


    public static void InserirUsuarios() {
        File dir = new File("F:\\ESCOLA\\EAD\\Lab Soft\\LDS-Lab01\\implementation\\LDS Prototipo\\src");
        File arquivoUsuarios = new File(dir, "Usuarios.txt");

        try {
            Usuario Usuario = new Usuario(1, "123", " Secretaria", 1);
            //Usuario Usuario1 = new Usuario(2, "123", " Paulo", 3);
            //Usuario Usuario2 = new Usuario(3, "1234", "Guilherme", 3);
            //Usuario Usuario3 = new Usuario(4, "12345", "Lucas", 3);

            FileWriter fileWriter = new FileWriter(arquivoUsuarios, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            printWriter.print(Usuario.toCsv());

            printWriter.flush();

            printWriter.close();
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
    