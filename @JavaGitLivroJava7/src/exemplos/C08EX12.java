package exemplos;
import java.io.*;
import java.util.*;

class C08EX12 {

  public static void main(String args[]) {

    List<String> LISTA = new ArrayList<>();

    int T;
    String N;

    Scanner s1 = new Scanner(System.in); 
    Scanner s2 = new Scanner(System.in); 
 
    // Entrada dos nomes

    System.out.println();
    System.out.print("Quantos nomes a entrar? ");
    T = s1.nextInt(); 

    System.out.println();
    for (int I = 0; I < T; I++) {
      System.out.printf("Entre o %3do. nome: ", I + 1);
      N = s2.nextLine(); 
      LISTA.add(N); 
    }

 
    // Apresentacao dos nomes

    System.out.println();   
    for (int I = 0; I < LISTA.size(); I++) {
      N = LISTA.get(I);
      System.out.printf("%3do. nome = %s\n", I + 1, N);
    }

  }
}
