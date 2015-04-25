package br.estacio.lpr.aluno.netto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import javax.swing.JOptionPane;

public class ProfessorDao {
    ArrayList<Professor> p = new ArrayList<Professor>();
    
    public ProfessorDao(){
    }
    
    public void addProfessor(Professor p){
        this.p.add(p);
    }
    
    public double getMediaTempo(){
        int somaT = 0;
        for(Professor p : this.p){
            if(!this.p.isEmpty()){
                somaT += p.getTempo();
            } else{
                JOptionPane.showMessageDialog(null, "Nenhum professor cadastrado.");
                break;
            }
        }
        return somaT / this.p.size();
    }
    
    public Professor maisAntigo(){
        int t = 0;
        if(!p.isEmpty()){
            for(Professor a : p){            
                if(a.getTempo() > t){
                    t = a.getTempo();
                }
            }
            Professor c = new Professor();
            c = busca(t);
            return c;
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum professor cadastrado.");
        }
        return null;        
    }
    
    public Professor busca(int t){
        if(!p.isEmpty()){
            for(Professor b : p){
                if(b.getTempo()== t){
                    return b;
                }
            }
        }
        return null;
    }
    
    public ArrayList<Professor> lista(){
        return p;
    }
}
