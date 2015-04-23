package cap03;
public class GetMessageEPrintStackTrace {
    public static void main(String args[]) {
        int x = 10;
        try {
            int y = x / 0; // gera uma excecao
        }
        catch (Exception erro) {
            System.out.println(erro.getMessage()); 
            erro.printStackTrace(); 
        }
    }
}

























