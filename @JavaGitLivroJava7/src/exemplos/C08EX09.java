package exemplos;
import java.io.*;

class C08EX09 {
  public static void main(String args[]) {
    int F = 1, I = 1, N;
    N = Integer.parseInt(args[0]);
    for (I = 1; I <= N; I++) 
      F *= I;
    System.out.println(F);
  }
}
