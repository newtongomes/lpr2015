package br.estacio.lp.questao4;

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
        if(!mes.isEmpty()){
            for(Mes m : mes){
                if(m.getIndex() == i){
                return m;
                } else{
                    JOptionPane.showMessageDialog(null, "Mes inexistente!");
                }
            }
        }
        return null;
    }
}
