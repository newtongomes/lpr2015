package exemplos;
import java.io.*;
import java.util.*;

class C08EX15 {

  public static void main(String args[]) {

    Set<String> LISTA = new HashSet<>();

    long T;
    int I;
    String N;

    Scanner s1 = new Scanner(System.in); 
    Scanner s2 = new Scanner(System.in); 

    // Entrada dos nomes na colecao LISTA

    System.out.println();
    System.out.print("Quantos nomes a entrar? ");
    T = s1.nextInt(); 

    System.out.println();
    for (I = 0; I < T; I++) {
      System.out.printf("Entre o %3do. nome: ", I + 1);
      N = s2.nextLine(); 
      LISTA.add(N); 
    }
    T = LISTA.size(); 

    // Apresentacao dos nomes na matriz RELACAO1
    // apos a entrada dos dados na colecao LISTA

    String RELACAO1[] = (String[])LISTA.toArray(new String[0]); 
    System.out.println();
    System.out.printf("Total de %1d elementos.\n\n", T);
    for (I = 0; I < T; I++) {
      System.out.printf("%3do. nome = %s\n", I + 1, RELACAO1[I]);
    }

    // Remocao de um item da lista

    System.out.println();
    System.out.printf("Qual nome sera removida ");
    N = s2.nextLine(); 
    LISTA.remove(N); 
    T = LISTA.size(); 
 
    // Apresentacao dos nomes na matriz RELACAO2
    // apos a remocao de um dos nomes da colecao LISTA

    String RELACAO2[] = (String[])LISTA.toArray(new String[0]); 
    System.out.println();
    System.out.printf("Total de %1d elementos.\n\n", T);
    for (I = 0; I < T; I++) {
      System.out.printf("%3do. nome = %s\n", I + 1, RELACAO2[I]);
    }
    System.out.println();

    // Remocao de todos os itens da lista

    LISTA.clear(); 
    T = LISTA.size(); 

    // Apresentacao dos nomes apos remocao de todos os itens
    // O conteudo de RELACAO2 nao sera apresentado, pois esta vazia
    // O laço for nao sera executado

    String RELACAO3[] = (String[])LISTA.toArray(new String[0]); 
    System.out.printf("Total de %1d elementos.\n\n", T);
    System.out.println();
    for (I = 0; I < RELACAO3.length; I++) {
      System.out.printf("%3do. nome = %s\n", I + 1, RELACAO3[I]);
    }

  }
}
