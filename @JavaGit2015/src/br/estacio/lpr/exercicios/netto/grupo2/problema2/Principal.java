package br.estacio.lp.problema2;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        AlunoDao dao = new AlunoDao();
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Opções:\n"
                    + "1 - Cadastrar aluno.\n"
                    + "2 - Consultar alunos.\n"
                    + "3 - Listar alunos.\n"
                    + "4 - Sair."));
            switch(op){
                case 1:
                    Aluno aluno = new Aluno();
                    aluno.setNome(JOptionPane.showInputDialog("Infome o nome do aluno:"));
                    aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Informe a matrícula:")));
                    aluno.setCurso(JOptionPane.showInputDialog("Informe o curso:"));
                    aluno.setMedia(Double.parseDouble(JOptionPane.showInputDialog("Informe a média:")));
                    dao.cadastrar(aluno);
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                    break;
                case 2:
                    int op2;
                    do{
                        op2 = Integer.parseInt(JOptionPane.showInputDialog("Opções:\n"
                                + "1 - Consultar por nome.\n"
                                + "2 - Consultar por matrícula.\n"
                                + "3 - Voltar"));
                        switch(op2){
                            case 1:
                                String str = "";
                                Aluno a = new Aluno();
                                a = dao.consultarNome(JOptionPane.showInputDialog("Informe o nome:"));                                
                                str = "Nome: " + a.getNome() 
                                        + "\nMatrícula: " + a.getMatricula() 
                                        + "\nCurso: " + a.getCurso()
                                        + "\nMédia: " + a.getMedia()
                                        + "\n";
                                JOptionPane.showMessageDialog(null, str);
                                break;
                            case 2:
                                String str2 = "";
                                Aluno b = new Aluno();
                                b = dao.consultarMatricula(Integer.parseInt(JOptionPane.showInputDialog("Informe o nome:")));
                                str2 += "Nome: " + b.getNome() 
                                        + "\nMatrícula: " + b.getMatricula() 
                                        + "\nCurso: " + b.getCurso()
                                        + "\nMédia: " + b.getMedia()
                                        + "\n";
                                JOptionPane.showMessageDialog(null, str2);
                                break;
                        }
                    }while(op2 != 3);
                    break;
                case 3:
                    int op3;
                    do{
                        op3 = Integer.parseInt(JOptionPane.showInputDialog("Opções:\n"
                                + "1 - Listar alfabeticamente.\n"
                                + "2 - Listar por médias decrescentes.\n"
                                + "3 - Voltar"));
                        switch(op3){
                            case 1:
                                String str3 = "";
                                for(Aluno x : dao.listarAlfabeticamente()){
                                    str3 += "Nome: " + x.getNome() 
                                            + "\nMatrícula: " + x.getMatricula() 
                                            + "\nCurso: " + x.getCurso()
                                            + "\nMédia: " + x.getMedia()
                                            + "\n";
                                }
                                JOptionPane.showMessageDialog(null, str3);
                                break;
                            case 2:
                                String str4 = "";                                
                                for(Aluno x : dao.listarMediaDecrescente()){
                                    str4 += "Nome: " + x.getNome() 
                                            + "\nMatrícula: " + x.getMatricula() 
                                            + "\nCurso: " + x.getCurso()
                                            + "\nMédia: " + x.getMedia()
                                            + "\n";
                                }
                                JOptionPane.showMessageDialog(null, str4);
                                break;
                        }
                    }while(op3 != 3);
                    break;
            }
        }while(op != 4);
    }    
}
