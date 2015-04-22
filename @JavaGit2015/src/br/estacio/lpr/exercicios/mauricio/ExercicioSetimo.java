package br.estacio.lpr.exercicios.mauricio;

/*****************************************************************************
 * Exercicio 07 (c) Mauricio Muñoz Lucero, 2015
 * Pretendemos armazenar os dados de todos os alunos da turma de Linguagem de
 * Programação com a matricula, nome, curso e média do aluno. Fazer um programa 
 * para armazenar os dados de uma turma de alunos com os dados acima, gerando
 * a lista de alunos em ordem alfabética, e a lista de alunos em ordem 
 * decrescente da média, com as opções de Incluir, Alterar, Consultar por Nome,
 * Consultar por Matricula e Excluir Alunos da Lista.
 *
 * Requisitos:
 * Usa a base de dados SQLite atraves do JDBC:
 * https://bitbucket.org/xerial/sqlite-jdbc/downloads/sqlite-jdbc-3.8.7.jar
 *****************************************************************************/

import java.util.Scanner; // Entrada de teclado

// Classes de manejo de Bases de Dados
import java.sql.Connection;	
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExercicioSetimo {

    // Definição das constantes
    final String version = "$VER:Exemplo 07 v1.0";

    // ----------------------------------------------------------------------------
    // Variáveis globais
    static Scanner teclado;
    static Connection conecaoBd;
    static Statement statement;

    // ----------------------------------------------------------------------------
    // Definição de classe simular o tipo tupla do C++
    static class ClasseResultado {
        boolean  erroConsulta;
        ResultSet dados;
        
        // Constructor da classe por omissão
        private ClasseResultado(boolean erro, ResultSet dados) {
            this.erroConsulta = erro;
            this.dados = dados;
        }
    }
    
    // ----------------------------------------------------------------------------
    // Funções

    // ----------------------------------------------------------------------------
    // Conectamos a nossa Base de Dados e se não existe
    // então creamos uma nova BD.
    // ----------------------------------------------------------------------------
    static Connection conectaBd (String nomeBd) throws ClassNotFoundException {
        // Carrega o sqlite-JDBC driver
        Class.forName("org.sqlite.JDBC");
        
        conecaoBd = null;
        statement = null;
        try {
            // create a database connection
            conecaoBd = DriverManager.getConnection("jdbc:sqlite:" + nomeBd);
            statement = conecaoBd.createStatement();
            ResultSet resultado = statement.executeQuery("SELECT SQLITE_VERSION() AS versao");
            resultado.next();
            System.out.println("Conectamos a nossa Base de Dados (SQLite " +
                                resultado.getString("versao") + ")");
            
            // Criamos a tabla Turma
            try {
                statement.executeUpdate("CREATE TABLE Turma (Matricula INT PRIMARY KEY, Nome TEXT, Curso TEXT, Media REAL)");
            } catch (SQLException e) { // A tabla Turma já existe
                System.err.println(e.getMessage());
            }
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.printf("BD Aberta!%n%n");
        }
        
        return conecaoBd;
    }
    
    // ----------------------------------------------------------------------------
    // Faz consulta
    // ----------------------------------------------------------------------------
    static ClasseResultado fazConsulta(String cadeia, boolean eSelect) {
        boolean erroConsulta = false;
        ResultSet dados;
        try {
            if (eSelect) 
                dados = statement.executeQuery(cadeia);
            else {
                statement.executeUpdate(cadeia);
                dados = null;
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            erroConsulta = true;
            dados = null;
        }

        return new ClasseResultado(erroConsulta, dados);
    }

    // ----------------------------------------------------------------------------
    // Geramos a lista de alunos em ordem alfabética
    // ----------------------------------------------------------------------------
    static ClasseResultado listaAlunosPorNome() {
        String cadeia = "SELECT * FROM Turma ORDER BY Nome";
        return fazConsulta(cadeia, true);
    }
    
    // ----------------------------------------------------------------------------
    // Geramos a lista de alunos em ordem decrescente da média
    // ----------------------------------------------------------------------------
    static ClasseResultado listaAlunosPorMedia() {
        String cadeia = "SELECT * FROM Turma ORDER BY Media DESC";
        return fazConsulta(cadeia, true);
    }

    // ----------------------------------------------------------------------------
    // Incluir aluno na BD
    // ----------------------------------------------------------------------------
    static boolean adicionarAluno(int matricula, String nome, String curso, float media) {
        String cadeia = "INSERT INTO Turma VALUES ('"+ matricula + "','" + nome +
                                            "','" + curso + "','" + media + "')";
        ClasseResultado consulta = fazConsulta(cadeia, false);
    
        return consulta.erroConsulta;
    }

    // ----------------------------------------------------------------------------
    // Alterar aluno na BD
    // ----------------------------------------------------------------------------
    static boolean modificarAluno(int matricula, String nome, String curso, float media) {
        String cadeia = "UPDATE Turma SET Nome='" + nome + "', Curso='" + curso +
                        "', Media='" + media + "' WHERE Matricula='" + matricula + "'";
                        
        ClasseResultado consulta = fazConsulta(cadeia, false);
    
        return consulta.erroConsulta;
    }

    // ----------------------------------------------------------------------------
    // Consultar aluno na BD por nome
    // ----------------------------------------------------------------------------
    static ClasseResultado procurarAlunoNome(String nome) {
        String cadeia = "SELECT * FROM Turma WHERE Nome='" + nome + "' ORDER BY Nome";
    
        return fazConsulta(cadeia, true);
    }

    // ----------------------------------------------------------------------------
    // Consultar aluno na BD por matricula
    // ----------------------------------------------------------------------------
    static ClasseResultado procurarAlunoMatricula(int matricula) {
        String cadeia = "SELECT * FROM Turma WHERE Matricula='" + matricula + "'";
    
        return fazConsulta(cadeia, true);
    }

    // ----------------------------------------------------------------------------
    // Excluir aluno na BD
    // ----------------------------------------------------------------------------
    static boolean eliminarAluno(int matricula) {
        String cadeia = "DELETE FROM Turma WHERE Matricula='" + matricula + "'";
    
        ClasseResultado consulta = fazConsulta(cadeia, false);

        return consulta.erroConsulta;
    }

    // ----------------------------------------------------------------------------
    // Mostrar dados de la BD
    // ----------------------------------------------------------------------------
    static void printDados(ResultSet dados) {
        System.out.printf("%nMatricula\tNome\tCurso\tMédia%n" +
                            "-------------------------------------%n");
        try {
            while (dados.next())
                System.out.printf(dados.getInt("Matricula") + "\t" +
                                    dados.getString("Nome") + "\t" +
                                    dados.getString("Curso") + "\t" +
                                    dados.getFloat("Media") + "%n");
        } catch (SQLException e) {
                System.err.println(e);
        }
        
        System.out.println();
    }

    // ----------------------------------------------------------------------------
    // Pedir uma cadeia de texto
    // ----------------------------------------------------------------------------
    static String pedirTexto(String texto) {
        String textoTmp;
        System.out.print("Forneca " + texto + ": ");
        textoTmp = teclado.nextLine();
        return textoTmp;
    }

    // ----------------------------------------------------------------------------
    // Pedir um número entero
    // ----------------------------------------------------------------------------
    static int pedirNumero(String texto) {
        int numero = -1;
    
        while (numero == -1) {
            try {
                System.out.print("Forneca o número " + texto + ": ");
                numero = teclado.nextInt();
            } catch (Exception e) {
                numero = -1;
            }
        }

        return numero;
    }

    // ----------------------------------------------------------------------------
    // Pedir um número real
    // ----------------------------------------------------------------------------
    float pedirReal(String texto) {
        float numero = (float) -1.0;
    
        while (numero == (float) -1.0) {
            try {
                System.out.print("Forneca " + texto + ": ");
                numero = teclado.nextFloat();
            } catch (Exception e) {
                numero = (float) -1.0;
            }
        }

        return numero;
    }

    // ----------------------------------------------------------------------------
    // Lee um número de opção
    // ----------------------------------------------------------------------------
    static int leeOpcao() {
        int opcao = -1;

        while (opcao == -1) {
            try {
                System.out.print("Escolha (1, 2, 3, 4, 5, 6, 7 ou 0): ");
                opcao = teclado.nextInt();
                if ((opcao < 0) && (opcao > 7))
                    opcao = -1;
            } catch (Exception e) {
                opcao = -1;
            }
        }
        return opcao;
    }
    
    // ----------------------------------------------------------------------------
    // Mostra o menu principal
    // ----------------------------------------------------------------------------
    void mostrarMenu() {
        System.out.println("JAlunos");
        System.out.println("-------");
        System.out.println("1.- Incluir Aluno");
        System.out.println("2.- Alterar Aluno");
        System.out.println("3.- Consultar Aluno por Nome");
        System.out.println("4.- Consultar Aluno por Matricula");
        System.out.println("5.- Excluir Aluno");
        System.out.println("6.- Listar Alunos por Nome");
        System.out.println("7.- Listar Alunos por Média");
        System.out.println();
        System.out.println("0.- Sair");
    }
    
    // ----------------------------------------------------------------------------
    // Programa principal
    public ExercicioSetimo () throws ClassNotFoundException {
        int matricula;
        String nome;
        String curso;
        float media;
        int opcao;
        ClasseResultado consulta;
        teclado = new Scanner(System.in);
        
        conecaoBd = conectaBd("turma.bd");

        if (conecaoBd != null) {
            boolean sairAplicativo = false;
            while (!sairAplicativo) {
                mostrarMenu();
    
                opcao = leeOpcao();
                switch (opcao) {
                    case 1:
                        // Incluir Aluno
                        matricula = pedirNumero("de Matricula");
                        teclado.nextLine(); // Fixa o bug de nextLine() depois de nextInt()
                        nome = pedirTexto("o Nome");
                        curso = pedirTexto("o Curso");
                        media = pedirReal("a Média");
                        adicionarAluno(matricula, nome, curso, media);
                        break;
                    case 2:
                        // Alterar Aluno
                        matricula = pedirNumero("de Matricula");
                        teclado.nextLine(); // Fixa o bug de nextLine() depois de nextInt()
                        nome = pedirTexto("o Nome");
                        curso = pedirTexto("o Curso");
                        media = pedirReal("a Média");
                        modificarAluno(matricula, nome, curso, media);
                        break;
                    case 3:
                        // Consultar Aluno por Nome
                        teclado.nextLine(); // Fixa o bug de nextLine() depois de nextInt()
                        nome = pedirTexto("o Nome");
                        consulta = procurarAlunoNome(nome);
                        if (!consulta.erroConsulta)
                            printDados(consulta.dados);
                        break;
                    case 4:
                        // Consultar Aluno por Matricula
                        matricula = pedirNumero("de Matricula");
                        consulta = procurarAlunoMatricula(matricula);
                        if (!consulta.erroConsulta)
                            printDados(consulta.dados);
                        break;
                    case 5:
                        // Excluir Aluno
                        matricula = pedirNumero("de Matricula");
                        consulta = procurarAlunoMatricula(matricula);
                        if (!consulta.erroConsulta)
                            eliminarAluno(matricula);
                        break;
                    case 6:
                        // Listar Alunos por Nome
                        consulta = listaAlunosPorNome();
                        if (!consulta.erroConsulta)
                            printDados(consulta.dados);
                        break;
                    case 7:
                        // Listar Alunos por Média
                        consulta = listaAlunosPorMedia();
                        if (!consulta.erroConsulta)
                            printDados(consulta.dados);
                        break;
                    case 0:
                        // Sair
                        sairAplicativo = true;
                        break;
                }

            }
            
            // Fechamos a BD
            try {
                conecaoBd.close();
            } catch (SQLException e) {
                // Erro ao fechar a BD
                System.err.println(e);
            }
        }

        // Fechamos o teclado para que eclipse não proteste (Warning)
        teclado.close();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        ExercicioSetimo exemplo = new ExercicioSetimo();
    }
}
