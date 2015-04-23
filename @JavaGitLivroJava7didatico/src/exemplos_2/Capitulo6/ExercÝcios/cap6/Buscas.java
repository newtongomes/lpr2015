package cap06;
public class Buscas {

    public static boolean buscaNumero(int numero, int[] numeros){
        boolean ret = false;
        for(int i=0;i<numeros.length;i++){
            if (numero == numeros[i]){
                ret = true;
                break;
            }
        }
        return ret;
    }

    public static String buscaPalavra(String[] palavras){
        String ret = "NÃO";
        for(int i=0;i<palavras.length;i++){
            if (palavras[i].equals("sexo")){
                ret = "SIM";
                break;
            }
        }
        return ret;
    }
}
