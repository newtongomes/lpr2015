package cap02;
public class ConversaoDeTipos {
    public static void main(String args[]) {
        double nota1, nota2, trabalho, media;
        nota1 = Double.parseDouble(args[0]);
        nota2 = Double.parseDouble(args[1]);
        trabalho = Double.parseDouble(args[2]);
        media = (nota1 + nota2 + trabalho) / 3;
        System.out.println("Media = " + media);
    }
}




