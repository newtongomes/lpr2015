package exemplos;
public class Taluno2 {
  String NOME;
  float MEDIA;

  public static boolean CondAluno(float ALUMEDIA, double CORMEDIA) {
    boolean CONDALUNO = true;
    if (ALUMEDIA < CORMEDIA)
      CONDALUNO = false;
    return(CONDALUNO);
  }

}
