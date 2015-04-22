package br.estacio.lpr.exercicios.mauricio;

/*****************************************************************************
 * Exercicio Nome Sobrenome (c) Mauricio Muñoz Lucero, 2015
 * Ler o nome e o sobrenome de uma pessoa, em seguida mostrar as formações:
 * a) Nome Sobrenome.
 * b) N.S.
 * c) Nome, S.
 * d) S., Nome.
 * e) NOME Sobrenome.
 *****************************************************************************/

import java.util.Scanner;   // Entrada de teclado

public class NomeSobrenome {
    // Definição das constantes
    final String version = "$VER:Nome Sobrenome v1.0";

    public NomeSobrenome () {
        Scanner teclado = new Scanner(System.in);
        String nomeCompleto, nome, sobrenome, cadeiaTmp;
        
        do {
            System.out.print("Forneça o nome completo de uma pessoa (ENTER Sair): ");
            // Leemos o nome e tiramos espácios sobrantes
            nomeCompleto = teclado.nextLine().trim();
            
            if (nomeCompleto.length() > 0) {
                // Separamos o nome completo em nome e sobrenome
                int posEspacio = nomeCompleto.indexOf(' ');
                nome = nomeCompleto.substring(0, posEspacio);
                sobrenome = nomeCompleto.substring(posEspacio + 1);

                // Tiramos o segundo sobrenome se existir
                sobrenome = sobrenome.substring(0, sobrenome.indexOf(' '));

                System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome);
                
                // a) Nome Sobrenome.
                cadeiaTmp = String.format("%1$s %2$s.",
                                    nome.substring(0, 1).toUpperCase().concat(nome.substring(1).toLowerCase()), 
                                    sobrenome.substring(0, 1).toUpperCase().concat(sobrenome.substring(1).toLowerCase()));
                
                System.out.println(cadeiaTmp);
                
                // b) N.S.
                cadeiaTmp = String.format("%1$s.%2$s.",
                                    nome.substring(0, 1).toUpperCase(), 
                                    sobrenome.substring(0, 1).toUpperCase());

                System.out.println(cadeiaTmp);

                // c) Nome, S.
                cadeiaTmp = String.format("%1$s, %2$s.",
                                    nome.substring(0, 1).toUpperCase().concat(nome.substring(1).toLowerCase()), 
                                    sobrenome.substring(0, 1).toUpperCase());
                
                System.out.println(cadeiaTmp);
                
                // d) S., Nome.
                cadeiaTmp = String.format("%2$s., %1$s.",
                                    nome.substring(0, 1).toUpperCase().concat(nome.substring(1).toLowerCase()), 
                                    sobrenome.substring(0, 1).toUpperCase());
                
                System.out.println(cadeiaTmp);
                
                // e) NOME Sobrenome.
                cadeiaTmp = String.format("%1$s %2$s.",
                                    nome.toUpperCase(), 
                                    sobrenome.substring(0, 1).toUpperCase().concat(sobrenome.substring(1).toLowerCase()));
                
                System.out.println(cadeiaTmp);
            }

            System.out.println();
        } while (nomeCompleto.length() > 0);
        
        teclado.close();
    }
    
    public static void main (String[] args) {
        // Instanciamos um objeto anônimo
        new NomeSobrenome();
    }
}
