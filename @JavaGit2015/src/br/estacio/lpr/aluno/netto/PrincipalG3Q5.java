package br.estacio.lpr.aluno.netto;

import javax.swing.JOptionPane;

public class PrincipalG3Q5 {
    public static void main(String[] args){
        String nome, sobrenome;
        nome = JOptionPane.showInputDialog("Informe seu nome: ");
        sobrenome = JOptionPane.showInputDialog("Informe seu sobrenome: ");
        
        normal(nome, sobrenome);
        abreviado(nome, sobrenome);
        sobrAbreviado(nome, sobrenome);
        sobrAbreviadoInvertido(nome, sobrenome);
        nomeMaiusculo(nome, sobrenome);
    }
    
    public static void normal(String nome, String sobrenome){
        char novo, velho;
        
        novo = Character.toUpperCase(nome.charAt(0));
        velho = nome.charAt(0);
        nome = nome.replaceFirst(String.valueOf(velho), String.valueOf(novo));
        
        novo = Character.toUpperCase(sobrenome.charAt(0));
        velho = sobrenome.charAt(0);
        sobrenome = sobrenome.replaceFirst(String.valueOf(velho), String.valueOf(novo));
      
        JOptionPane.showMessageDialog(null, nome + " " + sobrenome);
    }
    
    public static void abreviado(String nome, String sobrenome){
        char n, s;
        
        n = Character.toUpperCase(nome.charAt(0));
        s = Character.toUpperCase(sobrenome.charAt(0));
      
        JOptionPane.showMessageDialog(null, n + ". " + s + ".");
    }
    
    public static void sobrAbreviado(String nome, String sobrenome){
        char novo, velho;
        
        novo = Character.toUpperCase(nome.charAt(0));
        velho = nome.charAt(0);
        nome = nome.replaceFirst(String.valueOf(velho), String.valueOf(novo));
      
        JOptionPane.showMessageDialog(null, nome + " " + Character.toUpperCase(sobrenome.charAt(0)) + ".");
    }
    
    public static void sobrAbreviadoInvertido(String nome, String sobrenome){
        char novo, velho;
        
        novo = Character.toUpperCase(nome.charAt(0));
        velho = nome.charAt(0);
        nome = nome.replaceFirst(String.valueOf(velho), String.valueOf(novo));
      
        JOptionPane.showMessageDialog(null, Character.toUpperCase(sobrenome.charAt(0)) + "., " + nome);
    }
    
    public static void nomeMaiusculo(String nome, String sobrenome){
        char novo, velho;
        
        novo = Character.toUpperCase(sobrenome.charAt(0));
        velho = sobrenome.charAt(0);
        sobrenome = sobrenome.replaceFirst(String.valueOf(velho), String.valueOf(novo));
      
        JOptionPane.showMessageDialog(null, nome.toUpperCase() + " " + sobrenome);
    }
}