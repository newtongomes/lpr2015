package br.estacio.lp.questao3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MesDao {
    ArrayList<Mes> mes = new ArrayList<Mes>();

    public MesDao() {
    }
    
    public void addMes(Mes m){
        mes.add(m);
    }
    
    public ArrayList<Mes> lista() {
        return mes;
    }
    
    public Mes procura(int i){
        if(i >= 1 && i <= 12){
            if(!mes.isEmpty()){
                for(Mes m : mes){
                    if(m.getIndex() == i){
                    return m;
                    }
                }
            } else{
                JOptionPane.showMessageDialog(null, "Mes inexistente!");
            }
        } else{
            JOptionPane.showMessageDialog(null, "Mes inválido!");
        }
        return null;
    }
    
    public double getMediaAnual(){
        double soma = 0;
        for(Mes m : mes){
            if(!mes.isEmpty()){
                soma += m.getPrecipitacao();
            }
        }
        return soma / mes.size();
    }
        
    public Mes maiorPrecip(){
        int index = 0;
        double p = 0;
        if(!mes.isEmpty()){
            for(Mes m : mes){            
                if(m.getPrecipitacao() > p){
                    p = m.getPrecipitacao();
                    index = m.getIndex();
                }
            }
            Mes r = new Mes();
            r = procura(index);
            return r;
        }
        return null;        
    }
}
