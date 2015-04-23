public class Matriz {
   public static void main (String args[]) {
      double m[][] = new double[4][2]; // declara e aloca matriz 4 x 2
      for(int l=0; l<m.length; l++) { // preenche matriz
         for(int c=0; c<m[l].length; c++) {
            m[l][c] = l*m[l].length + c;
         }
      }
      for(int l=0; l<m.length; l++) { // exibe matriz
         for(int c=0; c<m[l].length; c++) {
            System.out.print(m[l][c] + "\t");
         }
         System.out.println();
      }
   }
}
