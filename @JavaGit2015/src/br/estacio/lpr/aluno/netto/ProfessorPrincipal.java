package br.estacio.lpr.aluno.netto;

import javax.swing.JOptionPane;

public class ProfessorPrincipal {
    public static void main(String[] args){
        ProfessorDao p = new ProfessorDao();
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Opções:\n"
                + "1 - Cadastrar professor.\n"
                + "2 - Média de idades.\n"
                + "3 - Professor com mais tempo de serviço.\n"
                + "4 - Listar todos\n"
                + "5 - Sair."));
            switch(op){
                case 1:
                    Professor pNovo =  new Professor();
                    pNovo.setNome(JOptionPane.showInputDialog("Informe o nome do professor: "));
                    pNovo.setTempo(Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo(em anos) de serviço de professor:")));
                    p.addProfessor(pNovo);
                    JOptionPane.showMessageDialog(null, "Professor cadastrado!");
                    break;
                case 2:
                    String str = "";
                    str = "Média do tempo de atividade dos professores cadastrados: " + String.valueOf(p.getMediaTempo()) + " anos";
                    JOptionPane.showMessageDialog(null, str);
                    break;
                case 3:
                    String str2 = "";
                    Professor p2 = new Professor();
                    p2 = p.maisAntigo();
                    str2 += "Professor com mais tempo de serviço:\n " + p2.getNome() + " - " + String.valueOf(p2.getTempo()) + " anos\n\n";
                    JOptionPane.showMessageDialog(null, str2);
                    break;
                case 4:
                    String str3 = "";
                    for(Professor a : p.lista()){
                        str3 = "Nome: " + a.getNome()
                            + "\nTempo de serviço: " + a.getTempo();
                    }
                    JOptionPane.showMessageDialog(null, str3);
                    break;
                default:
                    break;
            }
        }while(op!= 5);
        
    }
}
