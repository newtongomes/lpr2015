public class UsaOpcoes {
   public static void main(String a[]) {
      // imprime constantes
      for(Opcoes konst: Opcoes.values()) {
         System.out.printf("%-25s #%6d : %-20s\n", konst,
            konst.getValor(), konst.getNome());
         switch(konst) {
            case COMPACTAR:
               System.out.println("Opcao de compactacao");
               break;
            case DESCOMPACTAR:
               System.out.println("Opcao de descompactacao");
               break;
         }
      }
   }
}
