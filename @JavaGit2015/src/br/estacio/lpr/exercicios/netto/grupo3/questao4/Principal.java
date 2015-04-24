package br.estacio.lp.questao4;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        MesDao mDao = new MesDao();
        int op;        
        
        Mes jan = new Mes(1, "Janeiro", 31);
        Mes fev = new Mes(2, "Fevereiro", 28);
        Mes mar = new Mes(3, "Março", 31);        
        Mes abr = new Mes(4, "Abril", 30);
        Mes mai = new Mes(5, "Maio", 31);
        Mes jun = new Mes(6, "Junho", 30);
        Mes jul = new Mes(7, "Julho", 31);
        Mes ago = new Mes(8, "Agosto", 31);
        Mes set = new Mes(9, "Setembro", 30);
        Mes out = new Mes(10, "Outubro", 31);
        Mes nov = new Mes(11, "Novembro", 30);
        Mes dez = new Mes(12, "Dezembro", 31);
        
        mDao.addMes(jan);
        mDao.addMes(fev);
        mDao.addMes(mar);
        mDao.addMes(abr);
        mDao.addMes(mai);
        mDao.addMes(jun);
        mDao.addMes(jul);
        mDao.addMes(ago);
        mDao.addMes(set);
        mDao.addMes(out);
        mDao.addMes(nov);
        mDao.addMes(dez);
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Informe o número correspondente ao mes(1~12): "));
            Mes r = new Mes();
            r = mDao.procura(op);
            JOptionPane.showMessageDialog(null, "Mes: " + r.getNome() + "\nQuantidade de dias:" + r.getDias());
            op = Integer.parseInt(JOptionPane.showInputDialog("Deseja executar novamente? Para sair, digite 99."));
        }while(op != 99);
    }
}
