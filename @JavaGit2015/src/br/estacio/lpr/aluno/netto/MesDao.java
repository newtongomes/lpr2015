package br.estacio.lpr.aluno.netto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MesDao {
    ArrayList<Q4Mes> mes = new ArrayList<Q4Mes>();

    public MesDao() {
    }
    
    public void addMes(Q4Mes m){
        mes.add(m);
    }
    
    public ArrayList<Q4Mes> lista() {
        return mes;
    }
    
    public Q4Mes procura(int i){
        if(i >= 1 && i <= 12){
            if(!mes.isEmpty()){
                for(Q4Mes m : mes){
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
        for(Q4Mes m : mes){
            if(!mes.isEmpty()){
                soma += m.getPrecipitacao();
            }
        }
        return soma / mes.size();
    }
        
    public Q4Mes maiorPrecip(){
        int index = 0;
        double p = 0;
        if(!mes.isEmpty()){
            for(Q4Mes m : mes){            
                if(m.getPrecipitacao() > p){
                    p = m.getPrecipitacao();
                    index = m.getIndex();
                }
            }
            Q4Mes r = new Q4Mes();
            r = procura(index);
            return r;
        }
        return null;        
    }
}
