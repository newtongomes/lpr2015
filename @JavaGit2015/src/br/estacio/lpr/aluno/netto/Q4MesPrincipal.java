package br.estacio.lpr.aluno.netto;

import javax.swing.JOptionPane;

public class Q4MesPrincipal {
    public static void main(String[] args){
        Q4MesDao mDao = new Q4MesDao();
        int op;        
        
        Q4Mes jan = new Q4Mes(1, "Janeiro", 31);
        Q4Mes fev = new Q4Mes(2, "Fevereiro", 28);
        Q4Mes mar = new Q4Mes(3, "Março", 31);        
        Q4Mes abr = new Q4Mes(4, "Abril", 30);
        Q4Mes mai = new Q4Mes(5, "Maio", 31);
        Q4Mes jun = new Q4Mes(6, "Junho", 30);
        Q4Mes jul = new Q4Mes(7, "Julho", 31);
        Q4Mes ago = new Q4Mes(8, "Agosto", 31);
        Q4Mes set = new Q4Mes(9, "Setembro", 30);
        Q4Mes out = new Q4Mes(10, "Outubro", 31);
        Q4Mes nov = new Q4Mes(11, "Novembro", 30);
        Q4Mes dez = new Q4Mes(12, "Dezembro", 31);
        
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
            Q4Mes r = new Q4Mes();
            r = mDao.procura(op);
            JOptionPane.showMessageDialog(null, "Mes: " + r.getNome() + "\nQuantidade de dias:" + r.getDias());
            op = Integer.parseInt(JOptionPane.showInputDialog("Deseja executar novamente? Para sair, digite 99."));
        }while(op != 99);
    }
}
