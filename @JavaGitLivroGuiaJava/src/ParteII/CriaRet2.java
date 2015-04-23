public class CriaRet2 { // declara��o da classe CriaRet2
   public static void main (String arg[]) {
      try {
         double larg, alt; // vari�veis auxiliares
         larg = Double.parseDouble(arg[0]); // converte 1o arg. p/ double
         alt = Double.parseDouble(arg[1]); // converte 2o arg. p/ double
         Retangulo2 retangulo = new Retangulo2(larg, alt); // cria objeto
         System.out.println(retangulo); // exibe informa��es do objeto
      } catch (Exception exc) { // exibe erros ocorridos durante a execu��o
         System.out.println("Erro na execucao:\n" + exc);
      }
   }
}
