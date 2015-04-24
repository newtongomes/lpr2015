package br.estacio.lp.questao3;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        MesDao mDao = new MesDao();
        int op;        
        
        Mes jan = new Mes(1, "Janeiro", 31, 0.0);
        Mes fev = new Mes(2, "Fevereiro", 28, 0.0);
        Mes mar = new Mes(3, "Março", 31, 0.0);
        Mes abr = new Mes(4, "Abril", 30, 0.0);
        Mes mai = new Mes(5, "Maio", 31, 0.0);
        Mes jun = new Mes(6, "Junho", 30, 0.0);
        Mes jul = new Mes(7, "Julho", 31, 0.0);
        Mes ago = new Mes(8, "Agosto", 31, 0.0);
        Mes set = new Mes(9, "Setembro", 30, 0.0);
        Mes out = new Mes(10, "Outubro", 31, 0.0);
        Mes nov = new Mes(11, "Novembro", 30, 0.0);
        Mes dez = new Mes(12, "Dezembro", 31, 0.0);
        
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
                    Mes r = new Mes();
                    r = mDao.procura(Integer.parseInt(JOptionPane.showInputDialog("Informe o número correspondente ao mes(1 ~ 12).")));
                    r.setPrecipitacao(Double.parseDouble(JOptionPane.showInputDialog("Informe a precipitação diaria para o mes de:\n " + r.getNome() + r.getDias() + " dias")));
                    mDao.addMes(r);
                    JOptionPane.showMessageDialog(null, "Cadastro realizado!");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Precipitação anual: " + mDao.getMediaAnual());
                    break;
                case 3:
                    Mes a = new Mes();
                    a = mDao.maiorPrecip();
                    JOptionPane.showMessageDialog(null, "Maior precipitação:\n " + a.getNome() + "\n"
                            + a.getDias() + " dias\n"
                            + "Precipitação: " + a.getPrecipitacao());
                    break;
                case 4:
                    String str = "";
                    for(Mes m : mDao.lista()){
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
