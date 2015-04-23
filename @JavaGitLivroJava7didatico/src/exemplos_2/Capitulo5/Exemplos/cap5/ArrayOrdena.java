package cap05;
import java.util.*;
public class ArrayOrdena {
    public static void main(String[] args) {
        String[] nomes = {"Lucas","Daniel","Julia","Tatiana","Izabela","Matheus"};
        Arrays.sort(nomes);
        for(String nome: nomes){
            System.out.println(nome);
        }
        int[] numeros = new int[10];
        for (int i=0;i<10;i++){
            numeros[i]=(int)(Math.random()*100);
        }
        Arrays.sort(numeros);
        for(int numero: numeros){
            System.out.println(numero);
        }
        System.exit(0);
    }
}


