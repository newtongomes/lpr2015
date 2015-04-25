package br.estacio.lpr.aluno.netto;

import javax.swing.JOptionPane;

public class MesPrincipal {
    public static void main(String[] args){
        Q4MesDao mDao = new Q4MesDao();
        int op;        
        
        Q4Mes jan = new Q4Mes(1, "Janeiro", 31, 0.0);
        Q4Mes fev = new Q4Mes(2, "Fevereiro", 28, 0.0);
        Q4Mes mar = new Q4Mes(3, "Março", 31, 0.0);
        Q4Mes abr = new Q4Mes(4, "Abril", 30, 0.0);
        Q4Mes mai = new Q4Mes(5, "Maio", 31, 0.0);
        Q4Mes jun = new Q4Mes(6, "Junho", 30, 0.0);
        Q4Mes jul = new Q4Mes(7, "Julho", 31, 0.0);
        Q4Mes ago = new Q4Mes(8, "Agosto", 31, 0.0);
        Q4Mes set = new Q4Mes(9, "Setembro", 30, 0.0);
        Q4Mes out = new Q4Mes(10, "Outubro", 31, 0.0);
        Q4Mes nov = new Q4Mes(11, "Novembro", 30, 0.0);
        Q4Mes dez = new Q4Mes(12, "Dezembro", 31, 0.0);
        
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
            op = Integer.parseInt(JOptionPane.showInputDialog("Opções: \n"
                    + "1 - Cadastrar precipitação.\n"
                    + "2 - Média anual.\n"
                    + "3 - Mes com maior precipitação.\n"
                    + "4 - Listar tudo.\n"
                    + "0 - Sair."));
            switch(op){
                case 1:
                    Q4Mes r = new Q4Mes();
                    r = mDao.procura(Integer.parseInt(JOptionPane.showInputDialog("Informe o número correspondente ao mes(1 ~ 12).")));
                    r.setPrecipitacao(Double.parseDouble(JOptionPane.showInputDialog("Informe a precipitação diaria para o mes de:\n " + r.getNome() + r.getDias() + " dias")));
                    mDao.addMes(r);
                    JOptionPane.showMessageDialog(null, "Cadastro realizado!");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Precipitação anual: " + mDao.getMediaAnual());
                    break;
                case 3:
                    Q4Mes a = new Q4Mes();
                    a = mDao.maiorPrecip();
                    JOptionPane.showMessageDialog(null, "Maior precipitação:\n " + a.getNome() + "\n"
                            + a.getDias() + " dias\n"
                            + "Precipitação: " + a.getPrecipitacao());
                    break;
                case 4:
                    String str = "";
                    for(Q4Mes m : mDao.lista()){
                        str += m.getIndex() + " - " + m.getNome() + "\n"
                                + m.getDias() + " dias\n"
                                + "Precipitação: " + m.getPrecipitacao() + "\n\n";
                    }
                    JOptionPane.showMessageDialog(null, str);
                    break;
                default:
                    break;
            }
        }while(op != 0);
    }
}
