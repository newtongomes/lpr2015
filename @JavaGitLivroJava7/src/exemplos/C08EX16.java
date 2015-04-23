package exemplos;
import java.io.*;
import java.util.*;

class C08EX16 {

  public static void main(String args[]) {

    Map<Integer, String> LISTA = new HashMap<>();

    int T, I;
    String N;

    Scanner s1 = new Scanner(System.in); 
    Scanner s2 = new Scanner(System.in); 
 
    // Entrada dos nomes

    System.out.println();
    System.out.print("Quantos nomes a entrar? ");
    T = s1.nextInt(); 

    System.out.println();
    for (I = 0; I < T; I++) {
      System.out.printf("Entre o %3do. nome: ", I + 1);
      N = s2.nextLine(); 
      LISTA.put(I, N); 
    }
 
    // Apresentacao dos nomes

    System.out.println();
    for (I = 0; I < T; I++) {
      N = LISTA.get(I);
      System.out.printf("%3do. nome = %s\n", I + 1, N);
    }

    // Remocao de um item da lista

    System.out.println();
    System.out.printf("Entre posicao a ser removido .....: ");
    I = s2.nextInt(); 
    LISTA.remove(I - 1); 

    // Apresentacao dos nomes apos remocao de um item
    // A lista esta com menos um item

    System.out.println();
    for (I = 0; I < T; I++) {
      N = LISTA.get(I);
      System.out.printf("%3do. nome = %s\n", I + 1, N);
    }

    // Remocao de todos os itens da lista

    LISTA.clear(); 

    // Apresentacao dos nomes apos remocao de todos os itens
    // A lista nao sera apresenta, pois esta vazia
    // O laço for nao sera executado

    System.out.println();
    for (I = 0; I < T; I++) {
      N = LISTA.get(I);
      System.out.printf("%3do. nome = %s\n", I + 1, N);
    }

  }
}
