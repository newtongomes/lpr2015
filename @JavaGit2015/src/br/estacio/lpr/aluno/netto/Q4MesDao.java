package br.estacio.lpr.aluno.netto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Q4MesDao {
    ArrayList<Q4Mes> mes = new ArrayList<Q4Mes>();

    public Q4MesDao() {
    }
    
    public void addMes(Q4Mes m){
        mes.add(m);
    }
    
    public ArrayList<Q4Mes> lista() {
        return mes;
    }
    
    public Q4Mes procura(int i){
        if(!mes.isEmpty()){
            for(Q4Mes m : mes){
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
